Feature: Place the order for products
@PlaceOrder
Scenario Outline: Place order for the product upon applied the promocode
Given User is on Greencart landing page
When User searched with shortname<Name>and extracted actual name of the product
And Added"3"items of the selected product to cart
Then User proceeds to Checkout and validate the <Name> items in checkout page  
And verify user has ability to enter promo code and place the order 

Examples:
| Name|	
| beet |