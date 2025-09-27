package com.example.sandbox.model.ui

data class DomainDataModel(
    val organizationInfo: OrganizationUi,
    val emails: List<EmailUi>,
    val meta: MetaUi
)

data class OrganizationUi(
    val name: String,
    val websiteUrl: String,
    val location: String, // Combined city, state, country
    val socialLinks: SocialLinksUi,
    val disposable: Boolean,
    val webmail: Boolean,
    val phoneNumber: String,
    val industries: String,
    val founded: String,
    val companySize: String,
    val companyType: String,
    val revenue: String,
    val acceptAllEmails: Boolean,
    val description: String,
    val pattern: String,
    val totalSimilar: Int,
    val registrarName: String,
    val createdDate: String,
    val referralUrl: String,
    val lastUpdated: String
)

data class LocationUi(
    val country: String,
    val city: String,
    val state: String,
    val streetAddress: String,
    val postalCode: String
)

data class SocialLinksUi(
    val twitterUrl: String?,
    val facebookUrl: String?,
    val linkedinUrl: String?
)

data class EmailUi(
    val email: String,
    val fullName: String?,
    val firstName: String?,
    val lastName: String?,
    val gender: String?,
    val phoneNumberAvailable: Boolean,
    val type: String,
    val country: String,
    val position: String?,
    val department: String?,
    val seniority: String?,
    val twitter: String?,
    val linkedin: String?,
    val score: Int,
    val verificationStatus: String?,
    val verificationDate: String?,
    val sources: List<SourceUi>
)

data class SourceUi(
    val uri: String,
    val websiteUrl: String,
    val extractedOn: String,
    val lastSeenOn: String,
    val stillOnPage: Boolean
)

data class MetaUi(
    val total: Int,
    val pageSize: Int,
    val currentPage: Int,
    val totalPages: Int
)
