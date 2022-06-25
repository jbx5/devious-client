import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.net.Socket;
import java.net.InetAddress;
import java.io.DataInputStream;
import net.runelite.mapping.Export;
@ObfuscatedName("fr")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("v")
	@Export("javaVersion")
	public static String javaVersion;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lfm;")
	@Export("current")
	Task current;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lfm;")
	@Export("task")
	Task task;

	@ObfuscatedName("j")
	@Export("thread")
	Thread thread;

	@ObfuscatedName("e")
	@Export("isClosed")
	boolean isClosed;

	public TaskHandler() {
		this.current = null;
		this.task = null;
		this.isClosed = false;
		class360.javaVendor = "Unknown";
		javaVersion = "1.6";
		try {
			class360.javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception var2) {
		}
		this.isClosed = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "64")
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIILjava/lang/Object;B)Lfm;", garbageValue = "0")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;IB)Lfm;", garbageValue = "-14")
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Runnable;II)Lfm;", garbageValue = "966743438")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", garbageValue = "-443449853")
	public static String method3240(CharSequence var0) {
		String var1 = class229.base37DecodeLong(class339.method6244(var0));
		if (var1 == null) {
			var1 = "";
		}
		return var1;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(IIIZII)J", garbageValue = "608136618")
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = ((long) ((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14)) | (((long) (var4)) & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}
		return var5;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(descriptor = "([Lkb;IB)V", garbageValue = "79")
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}
					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						class7.runIntfCloseListeners(var4.group, var1);
					}
				}
				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					BoundaryObject.runScriptEvent(var5);
				}
				if (var1 == 1 && var3.onSubChange != null) {
					if (var3.childIndex >= 0) {
						Widget var6 = class140.getWidget(var3.id);
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) {
							continue;
						}
					}
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					BoundaryObject.runScriptEvent(var5);
				}
			}
		}
	}
}