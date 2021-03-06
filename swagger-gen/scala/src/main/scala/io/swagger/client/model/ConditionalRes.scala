/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api-testnet.bybit.com]  
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class ConditionalRes (
  stopOrderId: Option[String] = None,
  userId: Option[Number] = None,
  stopOrderStatus: Option[String] = None,
  symbol: Option[String] = None,
  side: Option[String] = None,
  orderType: Option[String] = None,
  price: Option[Double] = None,
  qty: Option[Number] = None,
  timeInForce: Option[String] = None,
  stopOrderType: Option[String] = None,
  basePrice: Option[Double] = None,
  stopPx: Option[Double] = None,
  orderLinkId: Option[String] = None,
  createdAt: Option[String] = None,
  updatedAt: Option[String] = None
)

