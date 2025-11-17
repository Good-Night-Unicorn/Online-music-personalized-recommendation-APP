const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot53084988/",
            name: "springboot53084988",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot53084988/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线音乐个性化推荐APP的设计与实现"
        } 
    }
}
export default base
