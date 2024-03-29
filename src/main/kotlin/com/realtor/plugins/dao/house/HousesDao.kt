package com.realtor.plugins.dao.house

import com.realtor.plugins.data.model.house.Houses

interface HousesDao {
    suspend fun insert(
        categoryId: Long,
        categoryTitle: String,
        title: String,
        price: String,
        type: String,
        size: String,
        rooms: String,
        address: String,
        mls: String,
        county: String,
        city: String,
        area: Long,
        neighborhood: String,
        zip: Long,
        style: String,
        builtYear: Long,
        taxes: String,
        description: String,
        dataSource: String,
        priceHistoryDate: String,
        priceHistoryDetail: String,
        restrictions: String,
        housingOlderPersonsAct: String,
        foreclosure: Boolean,
        views: Boolean,
        shortSale: Boolean,
        newConstruction: Boolean,
        adult: Boolean,
        leaseToOwn: Boolean,
        noHoaFees: Boolean,
        furnished: Boolean,
        pets: Boolean,
        primaryOnMain: Boolean,
        airConditioning: Boolean,
        sellerFinance: Boolean,
        green: Boolean,
        fixedUpper: Boolean,
        horse: Boolean,
        golf: Boolean,
        fireplace: Boolean,
        deck: Boolean,
        garage: Boolean,
        basement: Boolean,
        pool: Boolean
    ): Houses?

    suspend fun getHouses(): List<Houses>?
    suspend fun getHousesById(id: Long): Houses?
    suspend fun getHouseByCategoryId(id: Long): Houses?
    suspend fun getHousesListByCategoryId(id: Long): List<Houses>?
    suspend fun getTotalHousesByCategoryId(categoryId: Long): Long?
    suspend fun deleteHouseByCategoryId(id: Long): Int?
    suspend fun deleteHouseById(id: Long): Int?
    suspend fun updateHouseById(
        id: Long,
        title: String,
        price: String,
        type: String,
        size: String,
        rooms: String,
        address: String,
        mls: String,
        county: String,
        city: String,
        area: Long,
        neighborhood: String,
        zip: Long,
        style: String,
        builtYear: Long,
        taxes: String,
        description: String,
        dataSource: String,
        priceHistoryDate: String,
        priceHistoryDetail: String,
        restrictions: String,
        housingOlderPersonsAct: String,
        foreclosure: Boolean,
        views: Boolean,
        shortSale: Boolean,
        newConstruction: Boolean,
        adult: Boolean,
        leaseToOwn: Boolean,
        noHoaFees: Boolean,
        furnished: Boolean,
        pets: Boolean,
        primaryOnMain: Boolean,
        airConditioning: Boolean,
        sellerFinance: Boolean,
        green: Boolean,
        fixedUpper: Boolean,
        horse: Boolean,
        golf: Boolean,
        fireplace: Boolean,
        deck: Boolean,
        garage: Boolean,
        basement: Boolean,
        pool: Boolean
    ): Int?
    suspend fun getFilteredHouses(
        categoryTitle: String,
        title: String,
        city: String,
        beds: Int?,
        baths: Int?,
        minPrice: Double?,
        maxPrice: Double?
    ): List<Houses>?
}
