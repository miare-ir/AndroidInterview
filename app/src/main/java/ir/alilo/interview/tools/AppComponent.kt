package ir.alilo.interview.tools

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class])
interface AppComponent {
}