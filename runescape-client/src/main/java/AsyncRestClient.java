import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("AsyncRestClient")
public class AsyncRestClient {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1409881511
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;
	@ObfuscatedName("ah")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("af")
	@Export("threadFactory")
	final ThreadFactory threadFactory;
	@ObfuscatedName("at")
	@Export("threadPoolExecutor")
	final ThreadPoolExecutor threadPoolExecutor;

	public AsyncRestClient(String var1, int var2, int var3) {
		this.threadNamePrefix = var1;
		this.workQueueCapacity = var2;
		this.threadFactory = new RestClientThreadFactory(this);
		this.threadPoolExecutor = this.createThreadPoolExecutor(var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "1161266581"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Las;I)Lap;",
		garbageValue = "-1967224341"
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
		descriptor = "(I)V",
		garbageValue = "1920935364"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2070593164"
	)
	public static void method183() {
		ParamComposition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "929431107"
	)
	static double method185(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D;
		if (var3 > 0.0D && var3 < 1.0D) {
			double var5;
			double var7;
			switch(var2) {
			case 0:
				return var3;
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D);
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D);
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
			case 4:
				return var3 * var3;
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3);
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D) / 2.0D;
			case 7:
				return var3 * var3 * var3;
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D);
			case 9:
				return var3 < 0.5D ? var3 * var3 * 4.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D;
			case 10:
				return var3 * var3 * var3 * var3;
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D);
			case 12:
				return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 4.0D) / 2.0D;
			case 13:
				return var3 * var3 * var3 * var3 * var3;
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D);
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 5.0D) / 2.0D;
			case 16:
				return Math.pow(2.0D, 10.0D * var3 - 10.0D);
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3);
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + var3 * 20.0D) / 2.0D : (2.0D - Math.pow(2.0D, -20.0D * var3 + 10.0D)) / 2.0D;
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + var3 * -2.0D, 2.0D)) + 1.0D) / 2.0D;
			case 22:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return var3 * 2.70158D * var3 * var3 - var3 * var3 * 1.70158D;
			case 23:
				var5 = 1.70158D;
				var7 = 2.70158D;
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
			case 24:
				var5 = 1.70158D;
				var7 = 2.5949095D;
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (2.5949095D + (2.0D * var3 - 2.0D) * 3.5949095D) + 2.0D) / 2.0D;
			case 25:
				var5 = 2.0943951023931953D;
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((10.0D * var3 - 10.75D) * 2.0943951023931953D);
			case 26:
				var5 = 2.0943951023931953D;
				return Math.pow(2.0D, -10.0D * var3) * Math.sin(2.0943951023931953D * (10.0D * var3 - 0.75D)) + 1.0D;
			case 27:
				var5 = 1.3962634015954636D;
				var7 = Math.sin(1.3962634015954636D * (20.0D * var3 - 11.125D));
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D;
			default:
				return var3;
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILnt;IIIII[FB)Lnt;",
		garbageValue = "-98"
	)
	static Widget method184(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)((float)var1.width * var7[0]);
		var8.rawY = (int)(var7[1] * (float)var1.height);
		var8.rawWidth = (int)(var7[2] * (float)var1.width);
		var8.rawHeight = (int)((float)var1.height * var7[3]);
		return var8;
	}
}
