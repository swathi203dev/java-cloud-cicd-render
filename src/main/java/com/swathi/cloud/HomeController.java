package com.swathi.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
                <html>
                <head>
                    <title>SWATHI.DEV - Cloud Deployment</title>
                    <style>
                        body {
                            background: #101827;
                            color: white;
                            font-family: Arial;
                            text-align: center;
                            padding: 100px 20px;
                        }
                        h1 { color: #38bdf8; }
                        .box {
                            background: #1e293b;
                            padding: 35px;
                            border-radius: 15px;
                            display: inline-block;
                        }
                    </style>
                </head>
                <body>
                    <div class="box">
                        <h1>SWATHI.DEV</h1>
                        <h2>Java Cloud Deployment Project</h2>
                        <p>Built using Maven and Docker</p>
                        <p>Automated using Jenkins CI/CD</p>
                        <p>Published through Docker Hub</p>
                        <p>Deployed on Render</p>
                        <h3>Version 1.0 - Deployment Successful!</h3>
                    </div>
                </body>
                </html>
                """;
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}
