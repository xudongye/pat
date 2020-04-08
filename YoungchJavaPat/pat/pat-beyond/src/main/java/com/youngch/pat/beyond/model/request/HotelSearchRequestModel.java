package com.youngch.pat.beyond.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class HotelSearchRequestModel {
    @JsonProperty("ArriveTime")
    private String ArriveTime;
    @JsonProperty("DepartureTime")
    private String DepartureTime;
    @JsonProperty("HotelIds")
    private long[] HotelIds;
    @JsonProperty("HotelName")
    private String HotelName;
    @JsonProperty("OrgSns")
    private String[] OrgSns;
    @JsonProperty("CityId")
    private String CityId;
    @JsonProperty("DistrictId")
    private String DistrictId;
    @JsonProperty("Star")
    private Integer Star;
    @JsonProperty("CommercialLocationId")
    private String CommercialLocationId;
    @JsonProperty("Latitude")
    private float Latitude;
    @JsonProperty("Longitude")
    private float Longitude;
    @JsonProperty("Distance")
    private Integer Distance;
    @JsonProperty("ServiceTags")
    private String[] ServiceTags;
    @JsonProperty("OnlyOpenedHotel")
    private boolean OnlyOpenedHotel;
    @JsonProperty("CheckinType")
    private String CheckinType;
    @JsonProperty("RoomTypeIds")
    private String[] RoomTypeIds;
    @JsonProperty("MemberLevels")
    private String[] RoomStatuses;
    @JsonProperty("")
    private String[] MemberLevels;
    @JsonProperty("PhysicalRoomTypeOnly")
    private boolean PhysicalRoomTypeOnly;
    @JsonProperty("BasicInfoOnly")
    private boolean BasicInfoOnly;
    @JsonProperty("IncludeDetailCounts")
    private boolean IncludeDetailCounts;
    @JsonProperty("IncludePrices")
    private boolean IncludePrices;
    @JsonProperty("IncludeRoomCounts")
    private boolean IncludeRoomCounts;
    @JsonProperty("RateCode")
    private String RateCode;
    @JsonProperty("ContractorLevels")
    private String[] ContractorLevels;
    @JsonProperty("SearchType")
    private String SearchType;
    @JsonProperty("OrderByRequests")
    private OrderByRequestModel[] OrderByRequests;
    @JsonProperty("PageSize")
    private Integer PageSize;
    @JsonProperty("PageIndex")
    private Integer PageIndex;
}
