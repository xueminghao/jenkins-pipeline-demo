import com.demo.models.Param
import com.demo.tasks.Build

def call(Map params) {
        Param param = new Param()
        param.name = params.name
        param.repo = params.repo

        Build build = new Build()
        build.run(param)
}

return this