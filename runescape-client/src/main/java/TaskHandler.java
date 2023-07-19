import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("aw")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("ay")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lgu;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("as")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("aj")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		javaVendor = "Unknown";
		javaVersion = "1.6";

		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}

		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-226500506"
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
		descriptor = "(IIILjava/lang/Object;I)Lgu;",
		garbageValue = "1529565884"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lgu;",
		garbageValue = "-907549820"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lgu;",
		garbageValue = "2145317836"
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lmt;III)V",
		garbageValue = "-302173760"
	)
	public static void method3518(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3681;
		boolean var4 = var2 != var3.gender;
		var3.gender = var2;
		if (var4) {
			int var5;
			int var10;
			if (var3.gender == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var10 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var10] > 0 && var3.equipment[var10] < 512) {
						var3.equipment[var10] = var3.field3566[var10];
					}
				}
			} else {
				label100: {
					if (var3.equipment[0] >= 512) {
						boolean var11;
						if (var3.equipment[0] < 512) {
							var11 = false;
						} else {
							ItemComposition var6 = class125.ItemDefinition_get(var3.equipment[0] - 512);
							var11 = var6.maleModel1 != class210.field2297.field2292 && var6.maleModel2 != class210.field2297.field2292;
						}

						if (!var11) {
							break label100;
						}
					}

					var3.equipment[class210.field2297.field2292] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var10 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var10] > 0 && var3.equipment[var10] < 512) {
						int[] var7 = var3.equipment;

						for (int var8 = 0; var8 < KitDefinition.KitDefinition_fileCount; ++var8) {
							KitDefinition var9 = class132.KitDefinition_get(var8);
							if (var9 != null && !var9.nonSelectable && (var2 == 1 ? 7 : 0) + var5 == var9.bodypartID) {
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256;
								break;
							}
						}
					}
				}
			}
		}

		var3.method6128();
	}
}
