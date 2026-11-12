package com.swathi.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {
        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>SWATHI.DEV | DevOps Portfolio</title>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <style>
                * { box-sizing: border-box; }
                body {
                    margin: 0;
                    background: #0b1120;
                    color: #e2e8f0;
                    font-family: Arial, sans-serif;
                    line-height: 1.6;
                }
                header {
                    padding: 22px 8%;
                    display: flex;
                    justify-content: space-between;
                    align-items: center;
                    background: #111827;
                }
                header h2 { color: #38bdf8; margin: 0; }
                nav a {
                    color: #cbd5e1;
                    margin-left: 18px;
                    text-decoration: none;
                }
                section { padding: 65px 8%; }
                .hero { text-align: center; padding: 100px 8%; }
                .hero h1 { font-size: 48px; margin-bottom: 10px; }
                .blue { color: #38bdf8; }
                .button {
                    display: inline-block;
                    padding: 12px 22px;
                    margin: 10px;
                    background: #0284c7;
                    color: white;
                    border-radius: 8px;
                    text-decoration: none;
                }
                .grid {
                    display: grid;
                    grid-template-columns: repeat(auto-fit, minmax(220px, 1fr));
                    gap: 20px;
                }
                .card {
                    background: #172033;
                    padding: 24px;
                    border-radius: 12px;
                    border: 1px solid #263449;
                }
                .card h3 { color: #38bdf8; }
                a { color: #38bdf8; }
                footer {
                    text-align: center;
                    padding: 25px;
                    background: #111827;
                }
                @media(max-width: 600px) {
                    header { flex-direction: column; gap: 12px; }
                    nav a { margin: 6px; }
                    .hero h1 { font-size: 34px; }
                }
            </style>
        </head>
        <body>
            <header>
                <h2>SWATHI.DEV</h2>
                <nav>
                    <a href="#about">About</a>
                    <a href="#skills">Skills</a>
                    <a href="#projects">Projects</a>
                    <a href="#contact">Contact</a>
                </nav>
            </header>

            <section class="hero">
                <h1>Hi, I'm <span class="blue">Swathi</span></h1>
                <h2>DevOps & Cloud Engineering Portfolio</h2>
                <p>Building, automating and deploying applications using modern DevOps tools.</p>
                <a class="button" href="#projects">Explore My Projects</a>
                <a class="button" href="https://github.com/swathi203dev" target="_blank">GitHub Profile</a>
            </section>

            <section id="about">
                <h2 class="blue">About Me</h2>
                <div class="card">
                    <p>I am developing my skills in DevOps, cloud infrastructure,
                    CI/CD automation and application deployment through practical projects.</p>
                    <p>My focus is on learning how real applications are built,
                    tested, containerized and deployed.</p>
                </div>
            </section>

            <section id="skills">
                <h2 class="blue">Technical Skills</h2>
                <div class="grid">
                    <div class="card"><h3>Linux & Networking</h3><p>Ubuntu, Linux commands, SSH, DNS, HTTP and troubleshooting.</p></div>
                    <div class="card"><h3>CI/CD</h3><p>Git, GitHub, Jenkins, Maven and automated testing.</p></div>
                    <div class="card"><h3>Containers</h3><p>Docker, Docker Hub and Kubernetes.</p></div>
                    <div class="card"><h3>Cloud & Infrastructure</h3><p>Learning AWS and infrastructure automation.</p></div>
                    <div class="card"><h3>Monitoring</h3><p>Exploring Prometheus and Grafana.</p></div>
                </div>
            </section>

            <section id="projects">
                <h2 class="blue">DevOps Projects</h2>
                <div class="grid">
                    <div class="card">
                        <h3>Java Cloud CI/CD</h3>
                        <p>Java application built with Maven, containerized with Docker,
                        published to Docker Hub and deployed using Jenkins and Render.</p>
                        <a href="https://github.com/swathi203dev/java-cloud-cicd-render" target="_blank">View Source Code →</a>
                    </div>
                    <div class="card">
                        <h3>Website CI/CD with Kubernetes</h3>
                        <p>Automated website testing, Docker image publishing and
                        Kubernetes deployment using Jenkins.</p>
                        <a href="https://github.com/swathi203dev/jenkins-github-demoo" target="_blank">View Source Code →</a>
                    </div>
                </div>
            </section>

            <section id="contact">
                <h2 class="blue">Let's Connect</h2>
                <div class="card">
                    <p>Interested in my projects or DevOps journey?</p>
                    <a class="button" href="https://github.com/swathi203dev" target="_blank">Visit My GitHub</a>
                </div>
            </section>

            <footer>
                SWATHI.DEV | Built with Java, Spring Boot, Docker & Jenkins CI/CD
            </footer>
        </body>
        </html>
        """;
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}
