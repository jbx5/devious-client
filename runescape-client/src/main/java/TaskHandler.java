import java.io.DataInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
@Implements("TaskHandler")
public class TaskHandler implements Runnable {
	@ObfuscatedName("ac")
	@Export("javaVendor")
	public static String javaVendor;
	@ObfuscatedName("al")
	@Export("javaVersion")
	public static String javaVersion;
	@ObfuscatedName("dk")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("current")
	Task current;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhi;"
	)
	@Export("task")
	Task task;
	@ObfuscatedName("ao")
	@Export("thread")
	Thread thread;
	@ObfuscatedName("ah")
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/lang/Object;B)Lhi;",
		garbageValue = "99"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IS)Lhi;",
		garbageValue = "-20310"
	)
	@Export("newSocketTask")
	public final Task newSocketTask(String var1, int var2) {
		return this.newTask(1, var2, 0, var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Runnable;II)Lhi;",
		garbageValue = "-1310826122"
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

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(Lnm;III)V",
		garbageValue = "-23690326"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class275.method5566(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = class275.method5566(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				FriendsChat.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = AttackOption.method2714();
				if (var3 != -1) {
					class133.tempMenuAction = new MenuAction();
					class133.tempMenuAction.param0 = Client.menuArguments1[var3];
					class133.tempMenuAction.param1 = Client.menuArguments2[var3];
					class133.tempMenuAction.opcode = Client.menuOpcodes[var3];
					class133.tempMenuAction.identifier = Client.menuIdentifiers[var3];
					class133.tempMenuAction.itemId = Client.menuItemIds[var3];
					class133.tempMenuAction.action = Client.menuActions[var3];
					class133.tempMenuAction.target = Client.menuTargets[var3];
				}

			}
		}
	}
}
