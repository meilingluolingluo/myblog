```markdown
# MyBlog

## 项目介绍
MyBlog 是一个基于 Spring Boot 和 Vue.js 的博客系统，旨在提供一个简洁、高效的博客平台。该项目支持用户登录、文章发布、评论等功能，具有良好的用户体验和可扩展性。项目采用多模块架构，后端使用 Spring Boot 进行开发，前端使用 Vue 3 和 Vite 进行构建。

## 项目启动方式

### 后端启动

1. **环境准备**：
   - 确保安装 JDK 1.8 或以上版本。
   - 安装 Maven 3.6 或以上版本。

2. **克隆项目**：
   ```bash
   git clone https://github.com/meilingluolingluo/myblog.git
   ```

3. **构建项目**：
   ```bash
   mvn clean install
   ```
4. **修改数据库连接**：
   ```bash
     weblog-web/src/main/resources/application-dev.yml
   ```   

5. **运行后端**：
   ```bash
   cd myblog/weblog-web
   ```

### 前端启动

1. **环境准备**：
    - 确保安装 Node.js 14 或以上版本。

2. **克隆项目**：
   ```bash
   cd myblog/weblog-vue3
   ```

3. **安装依赖**：
   ```bash
   npm install
   ```

4. **运行前端**：
   ```bash
   npm run dev
   ```

### 访问
- 后端接口默认运行在 `http://localhost:8080`
- 前端应用默认运行在 `http://localhost:5173`

## 贡献
欢迎提交问题和 Pull Request，感谢您的支持！