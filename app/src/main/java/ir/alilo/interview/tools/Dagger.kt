package ir.alilo.interview.tools

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

class Dagger(var graph: AppComponent) {
    init {
        graph = DaggerAppComponent.builder()
            .domainModule(DomainModule())
            .build()
    }
}

@Module
open class DomainModule

class Expensive // This class should be singleton
class Complicated
class Big(complicated: Complicated, expensive: Expensive)

class Client {
    // Q14: Can we inject an instance of "Big" class here?
}
