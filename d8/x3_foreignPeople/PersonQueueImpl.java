

/**   Day 8 - Exercise 1 - Supermarket queue - MK got from GIT-02  **/

/**
* Didn't work to use - first issue is we have different set-up of people.
* e.g. fields, getters and setters.
*
* guess the thing to do would be to put GIT-02's person class instead of mine
* and then change my SupermarketScript as well....
*
*	BUT... 	then all that's left of 'my' way is the Supermarket (which doesn't do 
*			very much anyway...
*
** /


public class PersonQueueImpl implements PersonQueue {

    /**
    *  First point to person in queue
    */
	private Person first;

	/**
	*  Adds another person to the queue.
	*/
	public void insert(Person person) {
		if ( person == null ) {
			return;
		}

		if ( this.first == null ) {
			this.first = person;
		}
		else {
			this.first.add(person);
		}
	}

	/**
	*  Removes a person from the queue.
	*/
	public Person retrieve() {
		if ( this.first == null ) {
			return null;
		}
		else {
			Person p = this.first;
            this.first = this.first.getNext();
		    return p;
        }
	}

	/**
	*  Print the whole stack
	*/
	public void print() {
		if ( this.first == null ) {
			System.out.println("No one in queue");
		}
		else {
		    Person p = this.first;
		    do {
				if ( p != null ) {
                    System.out.println("Person in queue: "+p.getLastName()+","+p.getFirstName());
				}
				p = p.getNext();
			} while ( p != null );
		}
	}
}