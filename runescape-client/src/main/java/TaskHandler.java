import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("ay")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ax")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ao")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		class137.javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			class137.javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	@Export("close")
	public final void close() {
		synchronized(this) {
			this.isClosed = true;
			this.notifyAll();
		}

		try {
			this.thread.join();
		} catch (InterruptedException var3) {
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;I)Lik;",
		garbageValue = "1940410187"
	)
	@Export("newTask")
	final Task newTask(int var1, int var2, int var3, Object var4) {
		Task var5 = new Task();
		var5.type = var1;
		var5.intArgument = var2;
		var5.objectArgument = var4;
		synchronized(this) {
			if (this.task != null) {
				this.task.next = var5;
				this.task = var5;
			} else {
				this.task = this.current = var5;
			}

			this.notify();
			return var5;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lik;",
		garbageValue = "-418581900"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lik;",
		garbageValue = "2016641896"
	)
	@Export("newThreadTask")
	public final Task newThreadTask(Runnable var1, int var2) {
		return this.newTask(2, var2, 0, var1);
	}

	public final void run() {
		while (true) {
			Task var1;
			synchronized(this) {
				while (true) {
					if (this.isClosed) {
						return;
					}

					if (this.current != null) {
						var1 = this.current;
						this.current = this.current.next;
						if (this.current == null) {
							this.task = null;
						}
						break;
					}

					try {
						this.wait();
					} catch (InterruptedException var8) {
					}
				}
			}

			try {
				int var5 = var1.type;
				if (var5 == 1) {
					var1.result = new Socket(InetAddress.getByName((String)var1.objectArgument), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread((Runnable)var1.objectArgument);
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL)var1.objectArgument).openStream());
				}

				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1390157951"
	)
	public static int method4570(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ldy;[BIIIIIIIIIS)V",
		garbageValue = "229"
	)
	static final void method4571(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		CollisionMap[] var11 = var0.collisionMaps;
		int var13;
		if (var11 != null) {
			for (int var12 = 0; var12 < 8; ++var12) {
				for (var13 = 0; var13 < 8; ++var13) {
					if (var3 + var12 > 0 && var3 + var12 < var11[var2].flags.length && var13 + var4 > 0 && var13 + var4 < var11[var2].flags[var3 + var12].length) {
						int[] var10000 = var11[var2].flags[var3 + var12];
						var10000[var4 + var13] &= -1073741825;
					}
				}
			}
		}

		Buffer var25 = new Buffer(var1);

		for (var13 = 0; var13 < 4; ++var13) {
			for (int var14 = 0; var14 < 64; ++var14) {
				for (int var15 = 0; var15 < 64; ++var15) {
					if (var5 == var13 && var14 >= var6 && var14 < var6 + 8 && var15 >= var7 && var15 < var7 + 8) {
						int var16 = var3 + ObjectSound.method2012(var14 & 7, var15 & 7, var8);
						int var19 = var14 & 7;
						int var20 = var15 & 7;
						int var21 = var8 & 3;
						int var18;
						if (var21 == 0) {
							var18 = var20;
						} else if (var21 == 1) {
							var18 = 7 - var19;
						} else if (var21 == 2) {
							var18 = 7 - var20;
						} else {
							var18 = var19;
						}

						int var22 = var18 + var4;
						int var23 = var3 + (var14 & 7) + var9;
						int var24 = var10 + (var15 & 7) + var4;
						class238.loadTerrain(var0, var25, var2, var16, var22, var23, var24, var8);
					} else {
						class238.loadTerrain(var0, var25, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-64"
	)
	public static int method4565(int var0, int var1, int var2) {
		if (var1 < var0) {
			throw new IllegalArgumentException("max: " + var1 + " can not be lower than min: " + var0);
		} else {
			return Math.max(var0, Math.min(var2, var1));
		}
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIIIIIIIIIB)V",
		garbageValue = "39"
	)
	static void method4572(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		NodeDeque var11 = var0.pendingSpawns;
		PendingSpawn var12 = null;

		for (PendingSpawn var13 = (PendingSpawn)var11.last(); var13 != null; var13 = (PendingSpawn)var11.previous()) {
			if (var13.plane == var1 && var2 == var13.x && var3 == var13.y && var4 == var13.type) {
				var12 = var13;
				break;
			}
		}

		if (var12 == null) {
			var12 = new PendingSpawn();
			var12.plane = var1;
			var12.type = var4;
			var12.x = var2;
			var12.y = var3;
			var12.field1174 = -1;
			class233.method4786(var0, var12);
			var11.addFirst(var12);
		}

		var12.field1171 = var5;
		var12.field1176 = var6;
		var12.field1172 = var7;
		var12.delay = var9;
		var12.hitpoints = var10;
		var12.method2518(var8);
	}
}
