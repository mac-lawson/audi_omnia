
# Audi Omnia
![metasploit_logo](https://thehackernews.com/images/-ckd6SmLKsh4/Ti-xy6XFgBI/AAAAAAAACl0/fIL_5gG-RO4/s728-e100/metasploit_logo.png)

### About:
In 2010ish, Metasploit implemented the microphone recording feature to stdapi thanks to Matthew Weeks.  And then in 2012, we actually lost that command due to a typo.  We, and apparently everyone else, never noticed that until Wei Chen was looking at the webcam API again.  But of course, Metasploit quickly repaired the missing feature, and now "record_mic" is back in business as a meterpreter command in both Windows and Java meterpreter.  And yes, that means you get to use it in all kinds of platforms -- Windows, OSX, Linux, etc.



## Developers

- [Lead: Mac Lawson](https://www.github.com/mac-lawson)



## Deployment
Run :
```java
java run.java <ip> <port> <seconds to record>
```
