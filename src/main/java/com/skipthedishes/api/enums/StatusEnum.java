package com.skipthedishes.api.enums;

public enum StatusEnum {
	PENDING,
	AWAITING_PAYMENT,
	AWAITING_FULFILLMENT,
	AWAITING_SHIPMENT,
	AWAITING_PICKUP,
	PARTIALLY_SHIPPED,
	COMPLETED,
	SHIPPED,
	CANCELLED,
	DECLINED,
	REFUNDED,
	DISPUTED,
	VERIFICATION_REQUIRED,
	PARTIALLY_REFUNDED;
	
	/*
	Pending 				— customer started the checkout process but did not complete it. Incomplete orders are assigned a "Pending" status and can be found under the More tab in the View Orders screen.
	Awaiting Payment 		— customer has completed the checkout process, but payment has yet to be confirmed. Authorize only transactions that are not yet captured have this status.
	Awaiting Fulfillment 	— customer has completed the checkout process and payment has been confirmed
	Awaiting Shipment 		— order has been pulled and packaged and is awaiting collection from a shipping provider
	Awaiting Pickup 		— order has been packaged and is awaiting customer pickup from a seller-specified location
	Partially Shipped 		— only some items in the order have been shipped, due to some products being pre-order only or other reasons
	Completed 				— order has been shipped/picked up, and receipt is confirmed; an Authorize only transaction has been captured; client has paid for their digital product, and their file(s) are available for download
	Shipped 				— order has been shipped, but receipt has not been confirmed; seller has used the Ship Items action. A listing of all orders with a "Shipped" status can be found under the More tab of the View Orders screen.
	Cancelled 				— seller has canceled an order, due to a stock inconsistency or other reasons. Stock levels will automatically update depending on your Inventory Settings. Cancelling an order will not refund the order.
	Declined 				— seller has marked the order as declined for lack of manual payment, or other reasons
	Refunded 				— seller has used the Refund action. A listing of all orders with a "Refunded" status can be found under the More tab of the View Orders screen.
	Disputed 				— customer has initiated a dispute resolution process for the PayPal transaction that paid for the order
	Verification Required 	— order on hold while some aspect (e.g. tax-exempt documentation) needs to be manually confirmed. Orders with this status must be updated manually. Capturing funds or other order actions will not automatically update the status of an order marked Verification Required.
	Partially Refunded 		— seller has partially refunded the order.
	 
	 
	 
	 */
	

}
