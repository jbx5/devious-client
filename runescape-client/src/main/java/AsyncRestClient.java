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
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 692917959
	)
	@Export("workQueueCapacity")
	final int workQueueCapacity;
	@ObfuscatedName("aw")
	@Export("threadNamePrefix")
	final String threadNamePrefix;
	@ObfuscatedName("ak")
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "-118"
	)
	@Export("createThreadPoolExecutor")
	final ThreadPoolExecutor createThreadPoolExecutor(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.workQueueCapacity), this.threadFactory);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lau;B)Lad;",
		garbageValue = "-69"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "715259532"
	)
	@Export("shutdown")
	public final void shutdown() {
		try {
			this.threadPoolExecutor.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhc;",
		garbageValue = "1894317647"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1781968349"
	)
	public static void method178() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < JagexCache.field2391; ++var0) {
				UserComparator6.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lor;Ljava/lang/String;I)V",
		garbageValue = "-834096757"
	)
	static void method182(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field741 += var2.groupCount;
	}

	@ObfuscatedName("ig")
	@ObfuscatedSignature(
		descriptor = "(Ldn;B)V",
		garbageValue = "44"
	)
	static final void method170(WorldView var0) {
		for (GraphicsObject var1 = (GraphicsObject)var0.graphicsObjects.last(); var1 != null; var1 = (GraphicsObject)var0.graphicsObjects.previous()) {
			if (var0.plane == var1.plane && !var1.isFinished) {
				if (Client.cycle >= var1.cycleStart) {
					var1.advance(Client.graphicsCycle);
					if (var1.isFinished) {
						var1.remove();
					} else {
						var0.scene.drawEntity(var1.plane, var1.x, var1.y, var1.z, 60, var1, 0, -1L, false);
					}
				}
			} else {
				var1.remove();
			}
		}

	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZIB)I",
		garbageValue = "1"
	)
	@Export("insertMenuItem")
	static final int insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (Client.isMenuOpen) {
			return -1;
		} else {
			return !Decimator.method1168(var8, var2) ? -1 : Client.menu.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, var7, var8);
		}
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(IIIILvv;Lnw;I)V",
		garbageValue = "-1398773994"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			class424.redHintArrowSprite.method10603(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class421.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("pt")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	static void method169() {
		for (int var0 = 0; var0 < Client.field798.size(); ++var0) {
			if (AuthenticationScheme.method3356((Integer)Client.field798.get(var0)) != 2) {
				Client.field798.remove(var0);
				--var0;
			}
		}

	}
}
