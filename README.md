# ProrgessBar
Console Progress Bar percentege in Java runtime

[----------] 0%
[*---------] 10%
[*****-----] 50%
[**********] 100%


The main for is an example for 10 steps
  
 {
  for (int i = 0; i <= 10; i ++) {
            barProgress(i, 10);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
  }      
# USAGE

barProgress(i, 10);

- i = the step where is the process
- 10 = the total steps for the process
