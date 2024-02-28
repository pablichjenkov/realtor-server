package com.realtor.plugins.repository

import com.realtor.plugins.dao.ImagesDao
import com.realtor.plugins.data.model.Images
import com.realtor.plugins.data.table.ImagesTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.statements.InsertStatement

class ImagesRepository : ImagesDao {
    override suspend fun insert(imageUrl: String, description: String): Images? {
        val statement: InsertStatement<Number>? = null
        DatabaseFactory.dbQuery {
            ImagesTable.insert { image ->
                image[ImagesTable.imageUrl] = imageUrl
                image[ImagesTable.description] = description
            }
        }
        return statement?.resultedValues?.get(0)?.let { rowToResult(it) }
    }

    override suspend fun getAllImages(): List<Images>? {
        return DatabaseFactory.dbQuery {
            ImagesTable.selectAll()
                .mapNotNull {
                    rowToResult(it)
                }
        }
    }

    override suspend fun getImagesById(id: Int): Images? {
        TODO("Not yet implemented")
    }

    override suspend fun deleteImagesById(id: Int): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun updateImagesById(id: Int): Int? {
        TODO("Not yet implemented")
    }

    fun rowToResult(row: ResultRow): Images? {
        if (row == null) {
            return null
        } else {
            return Images(
                imageUrl = row[ImagesTable.imageUrl],
                description = row[ImagesTable.description]
            )
        }
    }
}