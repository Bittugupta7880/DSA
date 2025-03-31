def add_contact(contacts):
    name = input("Enter name: ").strip()
    phone = input("Enter phone: ").strip()
    email = input("Enter email: ").strip()
    
    # Basic validation example (could be expanded)
    if not name or not phone or not email:
        print("All fields are required. Try again.")
        return
    
    contacts.append({'name': name, 'phone': phone, 'email': email})
    print(f"Contact '{name}' added successfully.")

def view_contacts(contacts):
    if not contacts:
        print("No contacts found.")
    else:
        print("\nContacts List:")
        for idx, contact in enumerate(contacts, start=1):
            print(f"{idx}. Name: {contact['name']}, Phone: {contact['phone']}, Email: {contact['email']}")

def update_contact(contacts):
    index = int(input("Enter contact index to update: ")) - 1
    if 0 <= index < len(contacts):
        name = input("Enter new name: ")
        phone = input("Enter new phone: ")
        email = input("Enter new email: ")
        contacts[index] = {'name': name, 'phone': phone, 'email': email}
        print(f"Contact updated successfully.")
    else:
        print("Invalid contact index.")

def delete_contact(contacts):
    index = int(input("Enter contact index to delete: ")) - 1
    if 0 <= index < len(contacts):
        removed_contact = contacts.pop(index)
        print(f"Contact '{removed_contact['name']}' deleted successfully.")
    else:
        print("Invalid contact index.")

def search_contact(contacts):
    name = input("Enter name to search: ").strip()
    found_contacts = [contact for contact in contacts if name.lower() in contact['name'].lower()]
    if not found_contacts:
        print("No contacts found.")
    else:
        print("\nSearch Results:")
        for idx, contact in enumerate(found_contacts, start=1):
            print(f"{idx}. Name: {contact['name']}, Phone: {contact['phone']}, Email: {contact['email']}")

def main():
    contacts = []  # List to store contacts in memory
    while True:
        print("--------------------------------------------")
        print("\nContact Management System\n")
        print("--------------------------------------------")
        print("1. Add Contact")
        print("2. View Contacts")
        print("3. Update Contact")
        print("4. Delete Contact")
        print("5. Search Contact")
        print("6. Exit")
        print("--------------------------------------------")
        
        user_choice = input("Choose an option: ").strip()
        
        if user_choice == '1':
            add_contact(contacts)
        
        elif user_choice == '2':
            view_contacts(contacts)
        
        elif user_choice == '3':
            update_contact(contacts)
        
        elif user_choice == '4':
            delete_contact(contacts)
        
        elif user_choice == '5':
            search_contact(contacts)
        
        elif user_choice == '6':
            print("Exiting the program.")
            break
        
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
