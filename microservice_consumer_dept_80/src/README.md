#### Ribbon简介
- 客户端 负载均衡 LB 
   集中式LB 硬件F5 nginx等
   进程式LB 代码实现Ribbon，集成在客户端
   - Ribbon是Netflix发布的开源项目，主要提供客户端的软件负载均衡算法（可实现自定义负载均衡算法）
   - Ribbon客户端提供一系列完整的配置项，如连接超时，重试等。在配置文件中列出load Balancer后面
   所有的机器，Ribbon会自动帮助你基于某种规则去链接这些机器