package com.realtor.plugins.repository

import com.realtor.plugins.dao.CategoriesDao
import com.realtor.plugins.data.model.Categories
import com.realtor.plugins.data.model.Houses
import com.realtor.plugins.data.table.CategoriesTable
import com.realtor.plugins.data.table.HousesTable
import org.jetbrains.exposed.sql.*
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.statements.InsertStatement

class CategoriesRepository : CategoriesDao {
    override suspend fun insert(name: String, priority: Int): Categories? {
        var statement: InsertStatement<Number>? = null
        DatabaseFactory.dbQuery {
            statement = CategoriesTable.insert { category ->
                category[CategoriesTable.name] = name
                category[CategoriesTable.priority] = priority
            }
        }
        return rowToCategory(statement?.resultedValues?.get(0) !!)
    }

    override suspend fun getAllCategories(): List<Categories> =
        DatabaseFactory.dbQuery {
            CategoriesTable.selectAll().mapNotNull {
                    rowToCategory(it)
                }
        }


    override suspend fun getCategoryById(id: Long): Categories? =
        DatabaseFactory.dbQuery {
            CategoriesTable.select { CategoriesTable.id.eq(id) }
                .map {
                    rowToCategory(it)
                }.singleOrNull()
        }


    override suspend fun deleteCategoryById(id: Long): Int =
        DatabaseFactory.dbQuery {
            CategoriesTable.deleteWhere { CategoriesTable.id.eq(id) }
        }

    override suspend fun updateCategory(id: Long, name: String, priority: String): Int =
        DatabaseFactory.dbQuery {
            CategoriesTable.update({ CategoriesTable.id.eq(id) }) { category ->
                category[CategoriesTable.name] = name
                category[CategoriesTable.id] = id
            }
        }

    private fun rowToCategory(row: ResultRow): Categories? {
        if (row == null) {
            return null
        } else {
            return Categories(
                name = row[CategoriesTable.name],
                id = row[CategoriesTable.id],
                priority = row[CategoriesTable.priority]
            )
        }
    }
}