<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!--style>
body {
	color: #FF5F1F;
	background-color:#FFFFFF;
}
</style>
		<span class="sku" style="color:#189AB4;font-size: 30px;font-family:fantasy;margin-left: 630px">${fn:escapeXml(product.name)}(${fn:escapeXml(product.code)}) | Released:${product.publicationDate}</span><br>
		<span style="color:#189AB4;font-size: 30px;font-family:fantasy;margin-left: 630px">By: ${product.author} </span><span style="color:#123456;font-size: 24px">(Author) | Publisher: </span><span style="color:#189AB4;font-size: 30px;font-family:fantasy">${product.publisher}</span>
<div class="product-details page-title">
	<ycommerce:testId
		code="productDetails_productNamePrice_label_${product.code}">
	</ycommerce:testId>
	<!--  product:productReviewSummary product="${product}" showLinks="true" />
</div>
<div class="row">
	<div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
		<product:productImagePanel galleryImages="${galleryImages}" />
	</div>
	<div class="clearfix hidden-sm hidden-md hidden-lg"></div>
	<div class="col-sm-6 col-lg-8">
		<div class="product-main-info">
			<div class="row">
				<div class="col-lg-6">
					<div class="product-details">
						<product:productPromotionSection product="${product}" />
						<ycommerce:testId
							code="productDetails_productNamePrice_label_${product.code}">
							<product:productPricePanel product="${product}" />
						</ycommerce:testId>
						<div class="description">${ycommerce:sanitizeHTML(product.summary)}</div>
					</div>
				</div>

				<div class="col-sm-12 col-md-9 col-lg-6" style="color:red;font-size: 45px;" >
					<cms:pageSlot position="VariantSelector" var="component"
						element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div"
							class="yComponentWrapper page-details-variants-select-component" />
					</cms:pageSlot>
					<cms:pageSlot position="AddToCart" var="component" element="div"
						class="page-details-variants-select">
						<cms:component component="${component}" element="div"
							class="yComponentWrapper page-details-add-to-cart-component" />
					</cms:pageSlot>
				</div>
			</div>
		</div>
	</div>
</div>
<span style="font-size:45px;color:#189AB4; font-style:inherit; margin-left: 27px;"><u>Product Details</u></span><br>
<span style="color:#123456;font-size: 24px;margin-left: 27px;"><strong>Author :</strong></span>
<span style="color:#36454F;font-size: 24px;margin-left: 27px;"> ${product.author}</span><br>
<span style="color:#123456;font-size: 24px;margin-left: 27px;"><strong>ISBN :</strong></span>
<span style="color:#36454F;font-size: 24px;margin-left: 27px;"> ${product.isbn}</span><br>
<span style="color:#123456;font-size: 24px;margin-left: 27px;"><strong>No Of Pages :</strong></span>
<span style="color:#36454F;font-size: 24px;margin-left: 27px;"> ${product.noOfPages}</span><br>
<span style="color:#123456;font-size: 24px;margin-left: 27px;"><strong>Language :</strong></span>
<span style="color:#36454F;font-size: 24px;margin-left: 27px;"> ${product.languages}</span><br>
<span style="color:#123456;font-size: 24px;margin-left: 27px;"><strong>Publisher :</strong></span>
<span style="color:#36454F;font-size: 24px;margin-left: 27px;"> ${product.publisher}</span><br -->



<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<style>
.product-details {
	font-family: "Dosis", "Courier New", monospace;
	color: green;
}

table {
	border-collapse: collapse;
	position: relative;
	width: 50%;
}

div.table_head {
	width: 50%;
	padding-top: 15px;
	padding-bottom: 15px;
	background-color: #5c5470;
	color: white;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

table tr:hover {
	background-color: #ddd;
}

table td {
	padding: 8px 6px;
	vertical-align: top;
}
</style>


<div class="row">
	<div class="col-xs-10 col-xs-push-1 col-sm-6 col-sm-push-0 col-lg-4">
		<product:productImagePanel galleryImages="${galleryImages}" />
	</div>
	<div class="clearfix hidden-sm hidden-md hidden-lg"></div>
	<div class="col-sm-6 col-lg-8">
		<span class="sku"
			style="color: #189AB4; font-size: 30px; font-family: monospace;">${fn:escapeXml(product.name)}(${fn:escapeXml(product.code)})
			| Released:${product.publicationDate}</span><br> <span
			style="color: #189AB4; font-size: 30px; font-family: monospace; text-align: center;">By:
			${product.author} </span><span style="color: #123456; font-size: 24px">(Author)
			| Publisher: </span><span
			style="color: #189AB4; font-size: 30px; font-family: monospace;">${product.publisher}</span>

		<div class="product-details page-title">
			<ycommerce:testId
				code="productDetails_productNamePrice_label_${product.code}">
				<!-- div class="name">${fn:escapeXml(product.name)}<span class="sku">ID</span><span
						class="code">${fn:escapeXml(product.code)}</span>
				</div-->
			</ycommerce:testId>
			<product:productReviewSummary product="${product}" showLinks="true" />
		</div>
		<div class="product-main-info">
			<div class="row">
				<div class="col-lg-6">
					<div class="product-details">
						<product:productPromotionSection product="${product}" />
						<ycommerce:testId
							code="productDetails_productNamePrice_label_${product.code}">
							<product:productPricePanel product="${product}" />
						</ycommerce:testId>
						<div class="description">${ycommerce:sanitizeHTML(product.summary)}</div>
						<cms:pageSlot position="VariantSelector" var="component"
							element="div" class="page-details-variants-select">
							<cms:component component="${component}" element="div"
								class="yComponentWrapper page-details-variants-select-component" />
						</cms:pageSlot>
						<cms:pageSlot position="AddToCart" var="component" element="div"
							class="page-details-variants-select">
							<cms:component component="${component}" element="div"
								class="yComponentWrapper page-details-add-to-cart-component" />
						</cms:pageSlot>
						<!--
<ul>
<li>Author:${product.author}</li>
<li>ISBN:${product.isbn}</li>
<li>No Of Pages:${product.noOfPages}</li>
<li>Publisher:${product.publisher}</li>
<li>Publication Date:${product.publicationDate}</li>
</ul>
-->
					</div>
				</div>
				<%-- <div class="col-sm-12 col-md-9 col-lg-6">
					<cms:pageSlot position="VariantSelector" var="component"
						element="div" class="page-details-variants-select">
						<cms:component component="${component}" element="div"
							class="yComponentWrapper page-details-variants-select-component" />
					</cms:pageSlot>
					<cms:pageSlot position="AddToCart" var="component" element="div"
						class="page-details-variants-select">
						<cms:component component="${component}" element="div"
							class="yComponentWrapper page-details-add-to-cart-component" />
					</cms:pageSlot>
				</div>
 --%>			</div>
		</div>
	</div>
</div>
<div class="table_head"
	style="color: #ffffff; font-size: 27px; font-family:sans-serif; text-align: center;">PRODUCT
	DETAILS</div>

<table>
	<tr>
		<td>Author: ${product.author}</td>
		<td>ISBN: ${product.isbn}</td>
		<td>No Of Pages:${product.noOfPages}</td>
	</tr>
	<tr>
		<td>Publisher: ${product.publisher}</td>
		<td>Publication Date: ${product.publicationDate}</td>
		<td>Languages: ${product.languages}</td>
	</tr>
	<tr>
		<td>No Of Chapters: ${product.noOfChapters}</td>
		<td>Copyright Registration :${product.copyRegDate}</td>
		<td>No Of Pages:${product.bookWeight}</td>
	</tr>
	<tr>
		<td>Font: ${product.font}</td>
		<td>Copyright :${product.copyright}</td>
		<td>Awards :${product.awards}</td>
	</tr>
	<tr>
		<td>Age Category: ${product.ageCategory}</td>
		<td>Dimension :${product.dimension}</td>
		<td>Publication Location:${product.pubLoc}</td>
	</tr>
 	<tr>
		<td>Author Bio: ${product.authorBio}</td>
		<td>Discount :	${product.discount}</td>
		<td>Return:		${product.returnBook}</td>
	</tr>
	<tr>
		<td>Replace	: 	${product.replace}</td>
		<td>Status :	${product.status}</td>
	</tr>
</table>