class A:
    def __init__(self):
        self.a = "pratik"
    def __del__(self):
        print("Destructor called, A deleted.")

obj = A()
for i in range(5):
    print(obj.a)
del obj