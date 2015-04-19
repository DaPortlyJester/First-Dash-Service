# FIRST Dash REST Structure

## Top Level Entities
*Team*
*Game*
*Event*
*User / Member*
*League*
*Alliance*
*Awards*
*Locations*
*Sponsors*


### Team Hierarchy
* Team collection
* Team entity
  * Awards collection
    * Game collection (Awards for given game)
      * Event Collection
    * Event Collection
  * Events collection
  * Event entity
    * Matches collection
    * Match entity
  * Members collection
    * Member entity
		
### Game / Season Hierarchy
* Games collection (Years)
* Game entity
  * Events collection
  * Event entity
    * Matches collection
    * Match
  * Awards collection
    * Event collection

### Event Hierarchy
* Events collection
  * Game collection
* Event entity
  * Matches collection
  * Volunteers collection
  * Locations collection

### User Hierarchy
* TBD

### League Hierarchy
* Leagues collection
* League entity
  * Games collection
  * Events collection
  * Awards collection

### Alliance Hierarchy
* Alliances collection
* Alliance entity
  * Teams collection
  * Team entity

### Awards Hierarchy
* Awards collection
  * League collection
  * Game collection
* Awards Entity

### Locations Hierarchy
* Locations collection
* Location entity

### Sponsors Hierarchy
* Sponsors collection
* Sponsor entity
  * Teams collection
  * Events collection

