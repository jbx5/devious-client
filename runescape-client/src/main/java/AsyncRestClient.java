import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = 721426513
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2075666285
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;
	@ObfuscatedName("ap")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("af")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("aj")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "6509"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lau;B)Lay;",
		garbageValue = "-79"
	)
	@Export("submitRequest")
	public AsyncHttpResponse submitRequest(HttpRequest var1) {
		if (this.threadPoolExecutor.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.threadPoolExecutor.getCorePoolSize() + " Queue capacity " + this.workQueueCapacity);
			return new AsyncHttpResponse("Queue full");
		} else {
			AsyncHttpResponse var2 = new AsyncHttpResponse(this.threadPoolExecutor.submit(new HttpRequestTask(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "6524"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BI)Ljo;",
		garbageValue = "567576594"
	)
	static WorldMapSprite method182(byte[] var0) {
		return var0 == null ? new WorldMapSprite() : new WorldMapSprite(class181.method3691(var0).pixels);
	}
}
