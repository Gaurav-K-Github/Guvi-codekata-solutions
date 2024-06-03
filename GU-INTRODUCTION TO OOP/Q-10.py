# In a scenario where banks need to perform confidential fund or message transfers, each bank may utilize its encryption and decryption techniques. The Reserve Bank provides an interface with method names, leaving the implementation details to the individual banks.

# Create an interface BankTransfers.
# Add two methods with the following prototypes:
# public String encrypt(String a);
# public String decrypt(String a);
# Create a class ICICI which implements the BankTransfers interface and implements a simple encryption technique.
# Create a class HDFC which implements the BankTransfers interface and implements a simple encryption technique.
# Encryption techniques used by both banks:
# ICICI: Add 1 to the ASCII value of each character and insert the number '1' after every character.
# HDFC: Add 1 to the ASCII value of characters at even indices and subtract 1 from the ASCII value of characters at odd indices. Spaces are not encrypted.
# The reverse of both techniques will decrypt the message (i.e., original text).
# Input:

# Bank Type and the message.

# Output:

# Output the encrypted input.

# Sample Input:

# 1 welcome all

# Sample Output:

# x1f1m1d1p1n1f1!1b1m1m1
# ==============================================================================================
# -----------
# Source code:
# -----------


from abc import ABC, abstractmethod

# Interface BankTransfers
class BankTransfers(ABC):
    @abstractmethod
    def encrypt(self, text):
        pass

    @abstractmethod
    def decrypt(self, text):
        pass

# Class ICICI implementing BankTransfers
class ICICI(BankTransfers):
    def encrypt(self, text):
        encrypted_text = ""
        for char in text:
            encrypted_text += chr(ord(char) + 1) + '1'
        return encrypted_text

    def decrypt(self, text):
        decrypted_text = ""
        for i in range(0, len(text), 2):
            decrypted_text += chr(ord(text[i]) - 1)
        return decrypted_text

# Class HDFC implementing BankTransfers
class HDFC(BankTransfers):
    def encrypt(self, text):
        encrypted_text = ""
        for i, char in enumerate(text):
            if char != ' ':
                if i % 2 == 0:
                    encrypted_text += chr(ord(char) + 1)
                else:
                    encrypted_text += chr(ord(char) - 1)
            else:
                encrypted_text += char
        return encrypted_text

    def decrypt(self, text):
        decrypted_text = ""
        for i, char in enumerate(text):
            if char != ' ':
                if i % 2 == 0:
                    decrypted_text += chr(ord(char) - 1)
                else:
                    decrypted_text += chr(ord(char) + 1)
            else:
                decrypted_text += char
        return decrypted_text

# Main program
bank_type, user_name = input().split(maxsplit=1)

if bank_type == "1":
    icici = ICICI()
    encrypted_text = icici.encrypt(user_name)
elif bank_type == "2":
    hdfc = HDFC()
    encrypted_text = hdfc.encrypt(user_name)
else:
    encrypted_text = ""

print(encrypted_text)
