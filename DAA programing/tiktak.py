class BankAccount:
    def __init__(self, account_number, mobile_number):
        self.account_number = account_number
        self.mobile_number = mobile_number
        self.balance = 0
        
    def deposit(self, amount):
        if amount <= 0:
            print("Error: Deposit amount must be positive")
            return
        self.balance += amount
        print(f"Successfully deposited Rs{amount}. Your new balance is Rs{self.balance}.")
        
    def withdraw(self, amount):
        if amount <= 0:
            print("Error: Withdraw amount must be positive")
            return
        if amount > self.balance:
            print("Error: Insufficient balance")
        else:
            self.balance -= amount
            print(f"Successfully withdrew Rs{amount}. Your new balance is Rs{self.balance}.")
    
    def check_balance(self):
        print(f"Your current balance is Rs{self.balance}.")

def auth_user(accounts):
    account_number = input("Enter your account number: ")
    mobile_number = input("Enter your mobile number: ")
    
    for account in accounts:
        if account.account_number == account_number and account.mobile_number == mobile_number:
            print("Successfully logged in!")
            return account
    print("Authentication failed. Please check your account number and mobile number.")
    return None

def main():
    accounts = [
        BankAccount("1234567890", "9876543210"),
        BankAccount("1234567880", "9876543223")
    ] 
    user_account = auth_user(accounts)
    if user_account:
        while True:
            print("\nWhat do you want to do?")
            print("1. Deposit Money")
            print("2. Withdraw Money")
            print("3. Check Balance")
            choice = input("Enter your choice (1/2/3): ")
            
            if choice == '1':
                try:
                    amount = float(input("Enter amount to deposit: "))
                    user_account.deposit(amount)
                except ValueError:
                    print("Invalid input. Please enter a number.")
                    
            elif choice == '2':
                try:
                    amount = float(input("Enter amount to withdraw: "))
                    user_account.withdraw(amount)
                except ValueError:
                    print("Invalid input. Please enter a number.")
                    
            elif choice == '3':
                user_account.check_balance()
                
            else:
                print("Invalid choice. Please enter 1, 2, or 3.")
                
            continue_choice = input("Do you want to perform another task? (yes/no): ")
            if continue_choice.lower() != 'yes':
                break

if __name__ == "__main__":
    main()