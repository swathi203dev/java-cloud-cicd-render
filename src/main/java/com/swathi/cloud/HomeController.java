package com.swathi.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = "text/html")
    public String home() {
        return """
        <!DOCTYPE html>
        <html lang="en">
        <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SWATHI.DEV | DevOps Engineer</title>

        <style>
        * { margin:0; padding:0; box-sizing:border-box; scroll-behavior:smooth; }

        body {
            font-family: Arial, sans-serif;
            background:#08111f;
            color:#e5edf7;
            line-height:1.7;
        }

        nav {
            display:flex;
            justify-content:space-between;
            align-items:center;
            padding:20px 8%;
            background:#0d1929;
            position:sticky;
            top:0;
            z-index:10;
            border-bottom:1px solid #1e334b;
        }

        .logo { font-size:25px; font-weight:bold; color:#38bdf8; }

        nav a {
            color:#dbeafe;
            text-decoration:none;
            margin-left:20px;
            font-size:14px;
        }

        nav a:hover { color:#38bdf8; }

        section { padding:85px 10%; }

        .hero {
            min-height:520px;
            display:flex;
            flex-direction:column;
            justify-content:center;
            background:linear-gradient(120deg,#08111f,#102b46);
        }

        .hero h1 { font-size:55px; margin:15px 0; }
        .highlight { color:#38bdf8; }
        .hero p { max-width:650px; color:#a9bdd3; font-size:18px; }

        .button {
            display:inline-block;
            margin-top:25px;
            padding:12px 24px;
            background:#0284c7;
            color:white;
            border-radius:7px;
            text-decoration:none;
            width:fit-content;
        }

        .button:hover { background:#0369a1; }

        h2 { font-size:32px; margin-bottom:25px; color:#38bdf8; }

        .muted { color:#a9bdd3; max-width:850px; }

        .grid {
            display:grid;
            grid-template-columns:repeat(auto-fit,minmax(230px,1fr));
            gap:20px;
        }

        .card {
            background:#112238;
            padding:25px;
            border:1px solid #203b57;
            border-radius:12px;
            transition:0.3s;
        }

        .card:hover {
            transform:translateY(-5px);
            border-color:#38bdf8;
        }

        .card h3 { color:#7dd3fc; margin-bottom:12px; }
        .card p { color:#b4c5d8; font-size:14px; }

        .card a {
            display:inline-block;
            margin-top:15px;
            color:#38bdf8;
            text-decoration:none;
        }

        .skills span {
            display:inline-block;
            background:#112b43;
            border:1px solid #285071;
            padding:10px 17px;
            margin:7px;
            border-radius:20px;
            color:#bae6fd;
        }

        .pipeline {
            background:#112238;
            padding:25px;
            border-radius:12px;
            text-align:center;
            color:#7dd3fc;
            font-weight:bold;
            word-spacing:8px;
        }

        footer {
            text-align:center;
            padding:30px;
            background:#0d1929;
            color:#94a3b8;
        }

        @media(max-width:700px) {
            nav { flex-direction:column; gap:12px; }
            nav a { margin:5px; }
            .hero h1 { font-size:38px; }
            section { padding:60px 7%; }
        }
        </style>
        </head>

        <body>

        <nav>
            <div class="logo">SWATHI.DEV</div>
            <div>
                <a href="#home">Home</a>
                <a href="#about">About</a>
                <a href="#projects">Projects</a>
                <a href="#skills">Skills</a>
                <a href="#pipeline">Pipeline</a>
                <a href="#contact">Contact</a>
            </div>
        </nav>

        <section class="hero" id="home">
            <p class="highlight">WELCOME TO MY DEVOPS PORTFOLIO</p>
            <h1>Hi, I'm <span class="highlight">Swathi Reddy</span></h1>
            <h2>DevOps & Cloud Engineering Enthusiast</h2>
            <p>
                I build, automate and deploy applications using modern
                DevOps tools and cloud technologies. Explore my projects,
                technical skills and deployment journey.
            </p>
            <a class="button" href="#projects">Explore My Projects →</a>
        </section>

        <section id="about">
            <h2>About Me</h2>
            <p class="muted">
                I am an aspiring DevOps Engineer focused on application
                deployment, CI/CD automation, containerization and cloud
                infrastructure. I enjoy building practical projects that
                demonstrate how software moves from development to production.
            </p>
        </section>

        <section id="projects">
            <h2>My Projects</h2>
            <div class="grid">

                <div class="card">
                    <h3>Java Cloud CI/CD</h3>
                    <p>
                        Java application built with Maven, automated using
                        Jenkins, containerized with Docker and deployed on Render.
                    </p>
                    <a href="https://github.com/swathi203dev/java-cloud-cicd-render" target="_blank">GitHub Repository →</a>
                    <br>
                    <a href="https://swathi-java-cloud-app.onrender.com" target="_blank">Live Application →</a>
                </div>

                <div class="card">
                    <h3>DevOps Website Deployment</h3>
                    <p>
                        Automated website deployment using GitHub, Jenkins,
                        Docker, Docker Hub and Kubernetes.
                    </p>
                    <a href="https://github.com/swathi203dev/jenkins-github-demoo" target="_blank">GitHub Repository →</a>
                </div>

                <div class="card">
                    <h3>Infrastructure & Monitoring</h3>
                    <p>
                        Learning and building infrastructure automation,
                        application monitoring and observability projects.
                    </p>
                    <span class="highlight">In Progress</span>
                </div>

            </div>
        </section>

        <section id="skills">
            <h2>Technical Skills</h2>
            <div class="skills">
                <span>Linux</span>
                <span>Networking</span>
                <span>Git & GitHub</span>
                <span>Python</span>
                <span>Bash</span>
                <span>Maven</span>
                <span>Jenkins</span>
                <span>Docker</span>
                <span>Kubernetes</span>
                <span>AWS</span>
                <span>Terraform</span>
                <span>Prometheus</span>
                <span>Grafana</span>
            </div>
        </section>

        <section id="pipeline">
            <h2>My CI/CD Workflow</h2>
            <p class="muted">
                My Java application follows this automated delivery process:
            </p>
            <br>
            <div class="pipeline">
                GitHub → Jenkins → Maven → Docker → Docker Hub → Render
            </div>
        </section>

        <section id="contact">
            <h2>Let's Connect</h2>
            <p class="muted">
                Interested in DevOps, cloud engineering and automation?
                Explore my work and connect with me.
            </p>
            <a class="button" href="https://github.com/swathi203dev" target="_blank">
                Visit My GitHub →
            </a>
        </section>

        <footer>
            © 2026 SWATHI.DEV | Built with Java, Maven & DevOps
            <br>
            Learning • Building • Automating • Deploying
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