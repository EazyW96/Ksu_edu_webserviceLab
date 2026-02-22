# KSU Web Services Lab - Payment Processing System

This repository contains a full-stack SOAP Web Service implementation using **Apache CXF 3.0.3** and **Maven**.

## Project Architecture
- **HelloWorldCXF**: The Service Provider (Server) running on Apache Tomcat 9.
- **PaymentConsumer**: The Service Consumer (Client) that utilizes JAX-WS stubs.

## Lab Progress
### Lab 1: Contract-First Development (Main Branch)
- [cite_start]Successfully generated Java stubs from a WSDL contract[cite: 171, 172].
- [cite_start]Implemented a payment transaction client returning `Response result: true`[cite: 576, 844].
- [cite_start]Resolved environment-specific dependencies for Java 8+ compatibility[cite: 487, 488].

### Lab 2: WS-Standards (Current Branch)
- [cite_start]**WS-Security**: Implementation of `UsernameToken` authentication using WSS4J Interceptors[cite: 32, 40].
- [cite_start]**Authentication**: Custom `CallbackHandler` for server-side credential validation[cite: 35, 62].
- [cite_start]**MTOM**: Optimized binary file transmission (In Progress)[cite: 26, 138].

## How to Run
1. [cite_start]**Server**: Deploy `HelloWorldCXF` to Tomcat and start the server[cite: 434, 538].
2. [cite_start]**WSDL**: Verify the service is live at `http://localhost:8080/HelloWorldCXF/services/paymentProcessor?wsdl`[cite: 539, 540].
3. [cite_start]**Client**: Run `App.java` in the `PaymentConsumer` project as a Java Application[cite: 757, 842].

## Repository Link
[https://github.com/EazyW96/Ksu_edu_webserviceLab](https://github.com/EazyW96/Ksu_edu_webserviceLab)
