package com.realtor.plugins.data.table.house

import com.realtor.plugins.data.table.category.CategoriesTable
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.ReferenceOption
import org.jetbrains.exposed.sql.Table

object HousesTable : Table(name = "Houses") {
    val id: Column<Long> = long("id").autoIncrement()
    val categoryId: Column<Long> =
        long("categoryId").references(ref = CategoriesTable.id, onDelete = ReferenceOption.CASCADE)
    val categoryTitle: Column<String> =
        varchar("categoryTitle", length = 300)
    val title: Column<String> = varchar("title", length = 1500)
    val price: Column<String> = varchar("price", length = 1500)
    val type: Column<String> = varchar("type", length = 1500)
    val size: Column<String> = varchar("size", length = 1500)
    val rooms: Column<String> = varchar("rooms", length = 1000)
    val address: Column<String> = varchar("address", length = 500000)
    val mls: Column<String> = varchar("mls", length = 10000)
    val county: Column<String> = varchar("county", length = 10000)
    val city: Column<String> = varchar("city", length = 10000)
    val area: Column<Long> = long("area")
    val neighborhood: Column<String> = varchar("neighborhood", length = 10000)
    val zip: Column<Long> = long("zip")
    val style: Column<String> = varchar("style", length = 10000)
    val builtYear: Column<Long> = long("builtYear")
    val taxes: Column<String> = varchar("taxes", length = 10000)
    val description: Column<String> = varchar("description", length = 10000)
    val dataSource: Column<String> = varchar("dataSource", length = 10000)
    val priceHistoryDate: Column<String> = varchar("priceHistoryDate", length = 10000)
    val priceHistoryDetail: Column<String> = varchar("priceHistoryDetail", length = 10000)
    val restrictions: Column<String> = varchar("restrictions", length = 10000)
    val housingOlderPersonsAct: Column<String> = varchar("housingOlderPersonsAct", length = 10000)
    val foreclosure: Column<Boolean> = bool("foreclosure")
    val views: Column<Boolean> = bool("views")
    val shortSale: Column<Boolean> = bool("short_Sale")
    val newConstruction: Column<Boolean> = bool("new_construction")
    val adult: Column<Boolean> = bool("adult")
    val leaseToOwn: Column<Boolean> = bool("leaseToOwn")
    val noHoaFees: Column<Boolean> = bool("noHoaFees")
    val furnished: Column<Boolean> = bool("furnished")
    val pets: Column<Boolean> = bool("pets")
    val primaryOnMain: Column<Boolean> = bool("primaryOnMain")
    val airConditioning: Column<Boolean> = bool("aitConditioning")
    val sellerFinance: Column<Boolean> = bool("sellerFinance")
    val green: Column<Boolean> = bool("green")
    val fixedUpper: Column<Boolean> = bool("fixedUpper")
    val horse: Column<Boolean> = bool("horse")
    val golf: Column<Boolean> = bool("golf")
    val fireplace: Column<Boolean> = bool("fireplace")
    val deck: Column<Boolean> = bool("deck")
    val garage: Column<Boolean> = bool("garage")
    val basement: Column<Boolean> = bool("basement")
    val pool: Column<Boolean> = bool("pool")

    override val primaryKey: PrimaryKey = PrimaryKey(id)
}