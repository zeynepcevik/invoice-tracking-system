INVOICE TRACKING SYSTEM

Project Topic:
This project includes an invoice tracking system application. The user can add a file containing customer information to the system. This information includes customer name-surname, invoice type, 
invoice amount, priority level and transaction time. The added customer information is tracked using a priority queue data structure.

What has been done in the Project:  
• Read File First of all, I dynamically read the file. After the user selects the file from the  file selection screen, I print the file content to the list.  
• List by Priority: Then I added a button to list by priority. Because the transactions  processed from us are priority-based, I created a new button and list so that the user  can track the 
  correctness of the transactions. In this button, I sorted the customers  according to their priorities and printed them on the list.  
• Call Customer In the call customer button, as the button is pressed, I removed the  customers who receive service from the queue in a sequential manner and printed  them to the list.  
• Total Time In the Total time button, I have displayed the total service time of the  customers who have received service so far. If a customer continues to leave the  queue, the total time 
  will be updated when the button is pressed again.  
• Total Invoice In the Total Invoice button, I wrote the code that shows the total amount  paid by the people who have received the service until that moment. At the same  time, as the customer 
  exits the queue, the button updates the total amount when the  button is pressed again.  
• Enter Priority It is the button that prints the customers with the desired priority number  and the order of receiving service to the list.  
• Priority Total Time: This button lists the total time spent by customers with the  requested priority during the service.  
• Enter Invoice It is the button that prints the customers with the desired invoice type to  the list.  
• Reset It is a button that resets all the operations performed. Thus, the user can start  the operations without having to run the program again.  

In my code, I used JOptionPane to inform the user against entering wrong inputs.
