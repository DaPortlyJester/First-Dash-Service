# FIRST Dash REST Structure

## Top Level Entities
*Team*<br />
*Game*<br />
*Event*<br />
*User / Member*<br />
*League*<br />
*Alliance*<br />
*Awards*<br />
*Locations*<br />
*Sponsors* <br /> 


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
    * Event collection
* Awards Entity
  * Person Entity

### Locations Hierarchy
* Locations collection
* Location entity

### Sponsors Hierarchy
* Sponsors collection
* Sponsor entity
  * Teams collection
  * Events collection

