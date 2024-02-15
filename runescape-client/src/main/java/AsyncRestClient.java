import java.lang.management.GarbageCollectorMXBean;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ax")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("bc")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1265131985
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;
	@ObfuscatedName("aw")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("al")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("ai")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "48"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lak;B)Lad;",
		garbageValue = "-86"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1870631406"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26903"
	)
	public static void method165() {
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lng;Lnt;ZI)V",
		garbageValue = "-550444644"
	)
	public static void method161(Widget var0, PlayerComposition var1, boolean var2) {
		var0.modelType = 7;
		var0.field3774 = new PlayerComposition(var1);
		if (!var2) {
			var0.field3774.equipment = Arrays.copyOf(var0.field3774.field3666, var0.field3774.field3666.length);
			var0.field3774.method6477();
		}

	}
}
