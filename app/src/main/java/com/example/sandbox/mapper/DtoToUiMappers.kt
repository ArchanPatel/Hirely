package com.example.sandbox.mapper

import com.example.sandbox.model.api.ApiResponse
import com.example.sandbox.model.api.Email
import com.example.sandbox.model.api.Meta
import com.example.sandbox.model.api.Organization
import com.example.sandbox.model.api.SocialLinks
import com.example.sandbox.model.api.Source
import com.example.sandbox.model.ui.DomainDataModel
import com.example.sandbox.model.ui.EmailUi
import com.example.sandbox.model.ui.MetaUi
import com.example.sandbox.model.ui.OrganizationUi
import com.example.sandbox.model.ui.SocialLinksUi
import com.example.sandbox.model.ui.SourceUi

fun ApiResponse.toUiModel(): DomainDataModel {
    return DomainDataModel(
        organizationInfo = data.organization.toUiModel(),
        emails = data.emails.map { it.toUiModel() },
        meta = meta.toUiModel()
    )
}

fun Organization.toUiModel(): OrganizationUi {
    return OrganizationUi(
        name = organization,
        websiteUrl = website_url,
        location = "${location.city}, ${location.state}, ${location.country}",
        socialLinks = social_links.toUiModel(),
        disposable = disposable,
        webmail = webmail,
        phoneNumber = phone_number,
        industries = industries,
        founded = founded,
        companySize = company_size,
        companyType = company_type,
        revenue = revenue,
        acceptAllEmails = accept_all,
        description = description,
        pattern = pattern,
        totalSimilar = total_similar,
        registrarName = whois.registrar_name,
        createdDate = whois.created_date,
        referralUrl = whois.referral_url,
        lastUpdated = last_updated
    )
}

fun SocialLinks.toUiModel(): SocialLinksUi {
    return SocialLinksUi(
        twitterUrl = twitter_url,
        facebookUrl = facebook_url,
        linkedinUrl = linkedin_url
    )
}

fun Email.toUiModel(): EmailUi {
    return EmailUi(
        email = email,
        fullName = full_name,
        firstName = first_name,
        lastName = last_name,
        gender = gender,
        phoneNumberAvailable = phone_number,
        type = type,
        country = country,
        position = position,
        department = department,
        seniority = seniority,
        twitter = twitter,
        linkedin = linkedin,
        score = score,
        verificationStatus = verification.status,
        verificationDate = verification.date,
        sources = sources.map { it.toUiModel() }
    )
}

fun Source.toUiModel(): SourceUi {
    return SourceUi(
        uri = uri,
        websiteUrl = website_url,
        extractedOn = extracted_on,
        lastSeenOn = last_seen_on,
        stillOnPage = still_on_page
    )
}

fun Meta.toUiModel(): MetaUi {
    return MetaUi(
        total = total,
        pageSize = pageSize,
        currentPage = current,
        totalPages = total_pages
    )
}
