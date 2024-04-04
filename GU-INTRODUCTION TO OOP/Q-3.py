# You are required to implement a notification system for banks that notifies customers through SMS, Email, and monthly e-statement. The system consists of an interface Notification with three methods:

# notificationBySms()
# notificationByEmail()
# notificationByCourier()
# Implement two classes, Icici and Hdfc, which implement the Notification interface. Additionally, create a BankFactory class with two methods:

# public Icici getIcici() (returns an object for Icici)
# public Hdfc getHdfc() (returns an object for Hdfc)
# The main class should get input from the user and display the appropriate notification based on the bank and notification type selected.

# Input:

# The first integer corresponds to the name of the bank, and the next integer corresponds to the type of notification. If there is no valid input, display 'Invalid input'.

# Output:

# Output the notification message based on the bank and notification type selected.

# Sample Input:

# 1 1

# Sample Output:

# ICICI - Notification By SMS

# ==============================================================================================
# -----------

# Source code:
# -----------

# Notification interface
class Notification:
    def notificationBySms(self):
        pass

    def notificationByEmail(self):
        pass

    def notificationByCourier(self):
        pass


# Icici class implementing Notification interface
class Icici(Notification):
    def notificationBySms(self):
        print("ICICI - Notification By SMS")

    def notificationByEmail(self):
        print("ICICI - Notification By Email")

    def notificationByCourier(self):
        print("ICICI - Notification By Courier")


# Hdfc class implementing Notification interface
class Hdfc(Notification):
    def notificationBySms(self):
        print("HDFC - Notification By SMS")

    def notificationByEmail(self):
        print("HDFC - Notification By Email")

    def notificationByCourier(self):
        print("HDFC - Notification By Courier")


# BankFactory class
class BankFactory:
    @staticmethod
    def getIcici():
        return Icici()

    @staticmethod
    def getHdfc():
        return Hdfc()


# Main class
class Main:
    @staticmethod
    def main():

        # Read user input
        bank_choice, notification_choice = map(int, input().split())

        if bank_choice == 1:
            icici = BankFactory.getIcici()
            if notification_choice == 1:
                icici.notificationBySms()
            elif notification_choice == 2:
                icici.notificationByEmail()
            elif notification_choice == 3:
                icici.notificationByCourier()
            else:
                print("Invalid input")
        elif bank_choice == 2:
            hdfc = BankFactory.getHdfc()
            if notification_choice == 1:
                hdfc.notificationBySms()
            elif notification_choice == 2:
                hdfc.notificationByEmail()
            elif notification_choice == 3:
                hdfc.notificationByCourier()
            else:
                print("Invalid input")
        else:
            print("Invalid input")


if __name__ == "__main__":
    Main.main()
