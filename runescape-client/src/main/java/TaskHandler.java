import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.net.Socket;
import java.net.InetAddress;
import java.io.DataInputStream;
import net.runelite.mapping.Export;
@ObfuscatedName("fu")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("s")
	@Export("javaVendor")
	public static String javaVendor;

	@ObfuscatedName("h")
	@Export("javaVersion")
	public static String javaVersion;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lai;")
	@Export("soundSystem")
	static SoundSystem soundSystem;

	@ObfuscatedName("hi")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lfq;")
	@Export("current")
	Task current = null;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lfq;")
	@Export("task")
	Task task = null;

	@ObfuscatedName("c")
	@Export("thread")
	Thread thread;

	@ObfuscatedName("q")
	@Export("isClosed")
	boolean isClosed = false;

	public TaskHandler() {
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1651178951")
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;B)Lfq;", garbageValue = "-53")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;II)Lfq;", garbageValue = "-248279803")
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;II)Lfq;", garbageValue = "-1999660909")
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
					var1.result = new Socket(InetAddress.getByName(((String) (var1.objectArgument))), var1.intArgument);
				} else if (var5 == 2) {
					Thread var3 = new Thread(((Runnable) (var1.objectArgument)));
					var3.setDaemon(true);
					var3.start();
					var3.setPriority(var1.intArgument);
					var1.result = var3;
				} else if (var5 == 4) {
					var1.result = new DataInputStream(((URL) (var1.objectArgument)).openStream());
				}
				var1.status = 1;
			} catch (ThreadDeath var6) {
				throw var6;
			} catch (Throwable var7) {
				var1.status = 2;
			}
		} 
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIB)Z", garbageValue = "3")
	public static boolean method3189(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "2140154660")
	static final boolean method3190() {
		return Client.isMenuOpen;
	}
}