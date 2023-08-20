import time

while True:
    localtime = time.localtime()
    result = time.strftime("%I:%M:%S %p", localtime)
    print(result, "penis")
    time.sleep(5)
