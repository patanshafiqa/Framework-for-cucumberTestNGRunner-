Feature: Search and place the order for products
@OffersPage
Scenario Outline: Search Experience for product search in both home and offer page
Given User is on Greencart landing page
When User searched with shortname<Name>and extracted actual name of the product
Then User searched for <Name> shortname in offerpage
And validate product name matches in offerpage with landingpage

Examples:

| Name|	
| tom |
| beet|