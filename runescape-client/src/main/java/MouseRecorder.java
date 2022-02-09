import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("cu")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
    @ObfuscatedName("c")
    @Export("isRunning")
    boolean isRunning;

    @ObfuscatedName("l")
    @Export("lock")
    Object lock;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 28944215)
    @Export("index")
    int index;

    @ObfuscatedName("e")
    @Export("xs")
    int[] xs;

    @ObfuscatedName("r")
    @Export("ys")
    int[] ys;

    @ObfuscatedName("o")
    @Export("millis")
    long[] millis;

    MouseRecorder() {
        this.isRunning = true;
        this.lock = new Object();
        this.index = 0;
        this.xs = new int[500];
        this.ys = new int[500];
        this.millis = new long[500];
    }

    public void run() {
        for (; this.isRunning; Language.method5813(50L)) {
            synchronized(this.lock) {
                if (this.index < 500) {
                    this.xs[this.index] = MouseHandler.MouseHandler_x;
                    this.ys[this.index] = MouseHandler.MouseHandler_y;
                    this.millis[this.index] = MouseHandler.MouseHandler_millis;
                    ++this.index;
                }
            }
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-122")
    public static void method2100() {
        StructComposition.StructDefinition_cached.clear();
    }

    @ObfuscatedName("kz")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1953012058")
    @Export("FriendSystem_invalidateIgnoreds")
    static final void FriendSystem_invalidateIgnoreds() {
        Iterator var0 = Messages.Messages_hashTable.iterator();
        while (var0.hasNext()) {
            Message var1 = ((Message) (var0.next()));
            var1.clearIsFromIgnored();
        } 
        if (class67.friendsChat != null) {
            class67.friendsChat.invalidateIgnoreds();
        }
    }
}