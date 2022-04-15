package dev.unethicalite.client.script.blocking_events

class BlockingEventManager {

    companion object {
        val loginMessageHandlers: MutableMap<LoginEvent.Response, (LoginEvent.Response) -> Int> = mutableMapOf()
    }

    val blockingEvents = mutableSetOf(LoginEvent(), WelcomeScreenEvent(), ResizableEvent(), DeathEvent())

    fun addLoginResponseHandler(vararg responses: LoginEvent.Response, handler: (LoginEvent.Response) -> Int) {
        for (response in responses) {
            loginMessageHandlers[response] = handler
        }
    }

    fun removeLoginResponseHandler(message: LoginEvent.Response) {
        loginMessageHandlers.remove(message)
    }

    fun getLoginEvent(): LoginEvent? {
        return blockingEvents.firstOrNull { it.javaClass == LoginEvent::class.java } as LoginEvent?
    }

    /**
     * Removes a blocking event matching given class.
     */
    fun <T : BlockingEvent> remove(clazz: Class<T>) {
        blockingEvents.removeIf { it.javaClass == clazz }
    }

    /**
     * Gets a blocking event in the list matching given class.
     */
    @Suppress("UNCHECKED_CAST")
    fun <T : BlockingEvent> get(clazz: Class<T>): T? {
        if (blockingEvents.isEmpty()) {
            return null
        }

        return blockingEvents.firstOrNull { it.javaClass == clazz } as T
    }

    /**
     * Adds a new blocking event.
     */
    fun add(event: BlockingEvent) {
        blockingEvents.add(event)
    }
}
