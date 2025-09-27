package com.example.sandbox.model.api

import kotlinx.serialization.Serializable

@Serializable
data class ApiResponse(
    val data: Data,
    val meta: Meta
)

@Serializable
data class Data(
    val organization: Organization,
    val emails: List<Email>
)

@Serializable
data class Organization(
    val website_url: String,
    val organization: String,
    val location: Location,
    val social_links: SocialLinks,
    val disposable: Boolean,
    val webmail: Boolean,
    val phone_number: String,
    val industries: String,
    val founded: String,
    val company_size: String,
    val company_type: String,
    val revenue: String,
    val accept_all: Boolean,
    val description: String,
    val pattern: String,
    val total_similar: Int,
    val whois: Whois,
    val last_updated: String // Could use OffsetDateTime
)

@Serializable
data class Location(
    val country: String,
    val city: String,
    val state: String,
    val street_address: String,
    val postal_code: String
)

@Serializable
data class SocialLinks(
    val twitter_url: String?,
    val facebook_url: String?,
    val linkedin_url: String?
)

@Serializable
data class Whois(
    val registrar_name: String,
    val created_date: String,
    val referral_url: String
)

@Serializable
data class Email(
    val email: String,
    val first_name: String?,
    val last_name: String?,
    val full_name: String?,
    val gender: String?,
    val phone_number: Boolean,
    val type: String,
    val country: String,
    val position: String?,
    val department: String?,
    val seniority: String?,
    val twitter: String?,
    val linkedin: String?,
    val score: Int,
    val verification: Verification,
    val sources: List<Source>
)

@Serializable
data class Verification(
    val date: String?,
    val status: String?
)

@Serializable
data class Source(
    val uri: String,
    val website_url: String,
    val extracted_on: String,
    val last_seen_on: String,
    val still_on_page: Boolean
)

@Serializable
data class Meta(
    val total: Int,
    val pageSize: Int,
    val current: Int,
    val total_pages: Int,
    val params: Params
)

@Serializable
data class Params(
    val domain: String,
    val page: Int,
    val limit: Int,
    val department: String?,
    val country: String?,
    val type: String,
    val live: Boolean
)

