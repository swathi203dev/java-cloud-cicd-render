package com.swathi.cloud;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public ResponseEntity<String> home() {

        String html = """
        <!DOCTYPE html>
        <html lang="en">
        <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SWATHI.DEV | DevOps Portfolio</title>

        <style>
        * { margin:0; padding:0; box-sizing:border-box; scroll-behavior:smooth; }

        body {
            font-family: Arial, sans-serif;
            background:#080d19;
            color:#e8eefc;
            line-height:1.6;
        }

        a { text-decoration:none; color:inherit; }

        nav {
            display:flex;
            justify-content:space-between;
            align-items:center;
            padding:20px 8%;
            background:#0d1526;
            border-bottom:1px solid #1d2b45;
            position:sticky;
            top:0;
            z-index:10;
        }

        .logo { font-size:24px; font-weight:bold; color:#38bdf8; }
        nav a { margin-left:22px; color:#cbd5e1; font-size:14px; }
        nav a:hover { color:#38bdf8; }

        .hero {
            padding:100px 8% 85px;
            background:radial-gradient(circle at 80% 20%, #15365b, #080d19 55%);
        }

        .badge {
            display:inline-block;
            padding:7px 14px;
            border:1px solid #2563eb;
            border-radius:30px;
            color:#7dd3fc;
            font-size:13px;
            margin-bottom:22px;
        }

        h1 { font-size:clamp(38px, 6vw, 68px); line-height:1.1; }
        .highlight { color:#38bdf8; }
        .hero p { max-width:650px; color:#aab8d0; margin:22px 0; font-size:17px; }

        .button {
            display:inline-block;
            padding:12px 22px;
            border-radius:8px;
            background:#0284c7;
            color:white;
            font-weight:bold;
            margin:8px 8px 0 0;
        }

        .button.secondary { background:transparent; border:1px solid #475569; }

        section { padding:75px 8%; }
        .section-title { font-size:30px; margin-bottom:12px; }
        .section-subtitle { color:#94a3b8; margin-bottom:30px; }

        .grid {
            display:grid;
            grid-template-columns:repeat(auto-fit,minmax(220px,1fr));
            gap:20px;
        }

        .card {
            background:#111c30;
            border:1px solid #233653;
            padding:24px;
            border-radius:13px;
            transition:transform .2s,border .2s;
        }

        .card:hover { transform:translateY(-5px); border-color:#38bdf8; }
        .card h3 { color:#7dd3fc; margin-bottom:12px; }
        .card p { color:#aab8d0; font-size:14px; }
        .tag {
            display:inline-block;
            background:#172b47;
            color:#7dd3fc;
            padding:5px 10px;
            border-radius:20px;
            margin:5px 3px 0 0;
            font-size:12px;
        }

        .stats {
            display:grid;
            grid-template-columns:repeat(auto-fit,minmax(150px,1fr));
            gap:15px;
            margin-top:35px;
        }

        .stat {
            background:#111c30;
            border:1px solid #233653;
            padding:20px;
            border-radius:12px;
        }

        .stat strong { display:block; font-size:23px; color:#38bdf8; }
        .stat span { color:#94a3b8; font-size:13px; }

        .pipeline {
            display:flex;
            flex-wrap:wrap;
            gap:10px;
            align-items:center;
        }

        .pipeline span {
            background:#14243b;
            border:1px solid #2b4569;
            padding:12px 16px;
            border-radius:8px;
            color:#bae6fd;
        }

        .contact-box {
            background:linear-gradient(120deg,#102b4b,#111c30);
            padding:35px;
            border-radius:15px;
            border:1px solid #285078;
        }

        footer {
            text-align:center;
            padding:25px;
            color:#718096;
            border-top:1px solid #1d2b45;
            font-size:13px;
        }

        @media(max-width:700px) {
            nav { flex-direction:column; gap:12px; }
            nav a { margin:0 7px; }
            .hero { padding-top:65px; }
            section { padding:55px 6%; }
        }
        </style>
        </head>

        <body>

        <nav>
            <div class="logo">SWATHI.DEV</div>
            <div>
                <a href="#about">About</a>
                <a href="#skills">Skills</a>
                <a href="#projects">Projects</a>
                <a href="#pipeline">CI/CD</a>
                <a href="#contact">Contact</a>
            </div>
        </nav>

        <header class="hero">
            <div class="badge">● DEVOPS PORTFOLIO &nbsp; | &nbsp; HANDS-ON PROJECTS</div>
            <h1>Hi, I'm Swathi.<br>
            I build <span class="highlight">Cloud & DevOps</span><br>
            solutions.</h1>

            <p>
            Welcome to my engineering portfolio. I enjoy automating application
            deployments, working with cloud technologies, building CI/CD pipelines,
            and learning how production systems operate.
            </p>

            <a class="button" href="#projects">Explore Projects ↓</a>
            <a class="button secondary" href="https://github.com/swathi203dev" target="_blank">GitHub Profile ↗</a>

            <div class="stats">
                <div class="stat"><strong>CI/CD</strong><span>Automated pipelines</span></div>
                <div class="stat"><strong>Docker</strong><span>Containerization</span></div>
                <div class="stat"><strong>Cloud</strong><span>Deployment learning</span></div>
                <div class="stat"><strong>GitHub</strong><span>Project source code</span></div>
            </div>
        </header>

        <section id="about">
            <h2 class="section-title">About Me</h2>
            <p class="section-subtitle">A little about my engineering journey.</p>
            <div class="card">
                <p>
                I'm Swathi, an aspiring DevOps and Cloud Engineer with an IT
                background through the HCL TechBee programme. I'm building
                practical experience in application deployment, automation,
                containers, CI/CD, and cloud infrastructure.
                </p>
                <br>
                <p>
                My focus is on learning by building real projects, understanding
                how each technology works, and improving my ability to automate
                reliable software delivery.
                </p>
            </div>
        </section>

        <section id="skills">
            <h2 class="section-title">DevOps Skills</h2>
            <p class="section-subtitle">Tools and technologies I'm practising.</p>

            <div class="grid">
                <div class="card">
                    <h3>Operating Systems</h3>
                    <span class="tag">Linux</span><span class="tag">Ubuntu</span>
                    <span class="tag">Bash</span>
                </div>
                <div class="card">
                    <h3>Version Control</h3>
                    <span class="tag">Git</span><span class="tag">GitHub</span>
                </div>
                <div class="card">
                    <h3>CI/CD & Build</h3>
                    <span class="tag">Jenkins</span><span class="tag">Maven</span>
                    <span class="tag">GitHub Actions</span>
                </div>
                <div class="card">
                    <h3>Containers</h3>
                    <span class="tag">Docker</span><span class="tag">Kubernetes</span>
                </div>
                <div class="card">
                    <h3>Cloud & Infrastructure</h3>
                    <span class="tag">AWS</span><span class="tag">Terraform</span>
                </div>
                <div class="card">
                    <h3>Monitoring</h3>
                    <span class="tag">Prometheus</span><span class="tag">Grafana</span>
                </div>
            </div>
        </section>

        <section id="projects">
            <h2 class="section-title">Featured Projects</h2>
            <p class="section-subtitle">Hands-on work and source code.</p>

            <div class="grid">
                <div class="card">
                    <h3>Java Cloud CI/CD</h3>
                    <p>Automated Java application build and deployment using
                    Maven, Jenkins, Docker, Docker Hub and Render.</p>
                    <br>
                    <span class="tag">Java</span><span class="tag">Maven</span>
                    <span class="tag">Jenkins</span><span class="tag">Docker</span>
                    <br><br>
                    <a class="button" href="https://github.com/swathi203dev/java-cloud-cicd-render" target="_blank">View Source ↗</a>
                </div>

                <div class="card">
                    <h3>DevOps Website Deployment</h3>
                    <p>Website delivery pipeline using GitHub, Jenkins,
                    Docker, Docker Hub and Kubernetes.</p>
                    <br>
                    <span class="tag">Jenkins</span><span class="tag">Docker</span>
                    <span class="tag">Kubernetes</span>
                    <br><br>
                    <a class="button" href="https://github.com/swathi203dev/jenkins-github-demoo" target="_blank">View Source ↗</a>
                </div>

                <div class="card">
                    <h3>Infrastructure & Monitoring Labs</h3>
                    <p>Hands-on learning in infrastructure automation,
                    Linux administration, and application monitoring.</p>
                    <br>
                    <span class="tag">Linux</span><span class="tag">Terraform</span>
                    <span class="tag">Prometheus</span><span class="tag">Grafana</span>
                    <br><br>
                    <a class="button" href="https://github.com/swathi203dev" target="_blank">Explore GitHub ↗</a>
                </div>
            </div>
        </section>

        <section id="pipeline">
            <h2 class="section-title">My CI/CD Workflow</h2>
            <p class="section-subtitle">How code moves from a Git commit to deployment.</p>

            <div class="pipeline">
                <span>GitHub</span> →
                <span>Jenkins</span> →
                <span>Maven Tests</span> →
                <span>Docker Build</span> →
                <span>Docker Hub</span> →
                <span>Deployment</span>
            </div>
            <br>
            <div class="card">
                <h3>Automation in action</h3>
                <p>
                Code is stored in GitHub. Jenkins checks out the code,
                runs tests, builds a Docker image, publishes the image
                to Docker Hub, and triggers deployment.
                </p>
            </div>
        </section>

        <section id="contact">
            <div class="contact-box">
                <h2 class="section-title">Let's Connect</h2>
                <p class="section-subtitle">
                Explore my projects and follow my DevOps learning journey.
                </p>
                <a class="button" href="https://github.com/swathi203dev" target="_blank">GitHub Profile ↗</a>
                <a class="button secondary" href="https://github.com/swathi203dev/java-cloud-cicd-render" target="_blank">Project Repository ↗</a>
            </div>
        </section>

        <footer>
            © 2026 SWATHI.DEV | Built with Java & Spring Boot |
            Automated with Jenkins and Docker
        </footer>

        </body>
        </html>
        """;

        return ResponseEntity.ok(html);
    }

    @GetMapping(value = "/health", produces = MediaType.TEXT_PLAIN_VALUE)
    public String health() {
        return "Application is healthy!";
    }
}
