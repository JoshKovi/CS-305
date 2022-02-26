# CS-305
Portfolio item for Software Security class

- Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?
  Artemis Financial was a client in the banking industry looking to update and secure their software. They wanted secured and encrypted communication between users and
the server. Artemis Financial also was looking to check their vulnerabilities in relation to third party dependencies.

- What did you do particularly well in identifying their software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?
  Personally, I found all vulnerabilities from third party dependencies and recommended an appropriate plan of action (Specifically updating dependencies). These updates would remove all known vulnerabilities in the dependencies allowing the engineers to focus on secure communication and coding practices. Secure software enables a company to focus on giving value to their client rather than focusing on damage control when a vulnerability is exploited. Having secure software allows a company to build trust and confidence with their customers, while assuring that data (given by the customer) is secured and protected, even in the event of a leak having properly encrypted data limits the risk of customer data being extracted by a hostile actor.

- What about the process of working through the vulnerability assessment did you find challenging or helpful?
  I found working through the vulnerability assessment interesting and eye opening as it allowed me time to analyze dependency vulnerabilities, look for ways to correct
those vulnerabilities if possible and understand how attackers are able to attack systems. Additionally, understanding the vulnerability assessment reemphasizes the importance of staying up to date with security updates.


- How did you approach the need to increase layers of security? What techniques or strategies would you use in the future to assess vulnerabilities and determine mitigation techniques?
	I used SHA-512 to enhance the level of security by creating a checksum value that allowed verification of messages sent and received. In the future I will likely always incorporate the dependency vulnerability check (in Java) or an equivalent for my projects that I intend to release to a wider audience as it allows me to understand the security threats to my application if nothing else. Reading the vulnerability details also offers an insight into mitigation or elimination of the vulnerability in most cases and can additionally let you as a developer know if you are even exposed. In some cases, you may find that a vulnerability of a package is not relevant as the functionality required may be unused or explicitly deactivated, like in the case of the log4j vulnerability, where disabling certain features effectively rendered the vulnerability moot. 

- How did you ensure the code and software application were functional and secure? After refactoring code, how did you check to see whether you introduced new vulnerabilities?
	To ensure the code was functional, I ran the code and ensured there were no errors in compilation or runtime. To ensure the code was secure I ensured I used the proper techniques and tested for new vulnerabilities in the software. After refactoring, I ran the dependency/vulnerability check and ensured that no new vulnerabilities were introduced to the project.

- What resources, tools, or coding practices did you employ that you might find helpful in future assignments or tasks?
	Learning about the Java encryption support and the use of checksums was extremely useful and relevant. The usage of the OWASP dependency check was also a practice that I will likely employ in the future. 	


Employers sometimes ask for examples of work that you have successfully completed to demonstrate your skills, knowledge, and experience. What from this particular assignment might you want to showcase to a future employer?
	Personally, while some of the assignments in this course helped me learn and demonstrate knowledge gained, I think overall the usage of OWASP and understanding of flagged vulnerabilities is the most useful, in terms of a future employer. A quick google search can  give you a secure hashing algorithm or communication technique but understanding aa vulnerability report takes time and effort. In terms of professional skills, this is likely the most useful to have.
