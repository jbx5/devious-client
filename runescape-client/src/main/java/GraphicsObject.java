import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("bb")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -262909963)
    @Export("id")
    int id;

    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 599378473)
    @Export("cycleStart")
    int cycleStart;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -627398169)
    @Export("plane")
    int plane;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1998050683)
    @Export("x")
    int x;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -608274421)
    @Export("y")
    int y;

    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 1971033417)
    @Export("height")
    int height;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lgm;")
    @Export("sequenceDefinition")
    SequenceDefinition sequenceDefinition;

    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 630808285)
    @Export("frame")
    int frame;

    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 924799293)
    @Export("frameCycle")
    int frameCycle;

    @ObfuscatedName("a")
    @Export("isFinished")
    boolean isFinished;

    GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.frame = 0;
        this.frameCycle = 0;
        this.isFinished = false;
        this.id = var1;
        this.plane = var2;
        this.x = var3;
        this.y = var4;
        this.height = var5;
        this.cycleStart = var7 + var6;
        int var8 = Widget.SpotAnimationDefinition_get(this.id).sequence;
        if (var8 != (-1)) {
            this.isFinished = false;
            this.sequenceDefinition = class78.SequenceDefinition_get(var8);
        } else {
            this.isFinished = true;
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "267286155")
    @Export("advance")
    final void advance(int var1) {
        if (!this.isFinished) {
            this.frameCycle += var1;
            if (!this.sequenceDefinition.isCachedModelIdSet()) {
                while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
                    this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
                    ++this.frame;
                    if (this.frame >= this.sequenceDefinition.frameIds.length) {
                        this.isFinished = true;
                        break;
                    }
                } 
            } else {
                this.frame += var1;
                if (this.frame >= this.sequenceDefinition.method3637()) {
                    this.isFinished = true;
                }
            }
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(B)Lgf;", garbageValue = "39")
    @Export("getModel")
    protected final Model getModel() {
        SpotAnimationDefinition var1 = Widget.SpotAnimationDefinition_get(this.id);
        Model var2;
        if (!this.isFinished) {
            var2 = var1.getModel(this.frame);
        } else {
            var2 = var1.getModel(-1);
        }
        return var2 == null ? null : var2;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "562525808")
    @Export("addChatMessage")
    static void addChatMessage(int var0, String var1, String var2, String var3) {
        ChatChannel var4 = ((ChatChannel) (Messages.Messages_channels.get(var0)));
        if (var4 == null) {
            var4 = new ChatChannel();
            Messages.Messages_channels.put(var0, var4);
        }
        Message var5 = var4.addMessage(var0, var1, var2, var3);
        Messages.Messages_hashTable.put(var5, ((long) (var5.count)));
        Messages.Messages_queue.add(var5);
        Client.chatCycle = Client.cycleCntr;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IIIB)Lbl;", garbageValue = "73")
    @Export("getWorldMapScript")
    static Script getWorldMapScript(int var0, int var1, int var2) {
        int var3 = class9.method83(var1, var0);
        Script var4 = Projectile.method1969(var3, var0);
        if (var4 != null) {
            return var4;
        } else {
            var3 = BoundaryObject.method4275(var2, var0);
            var4 = Projectile.method1969(var3, var0);
            return var4 != null ? var4 : null;
        }
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-534888453")
    public static void method1890() {
        ItemComposition.ItemDefinition_cachedSprites.clear();
    }

    public GraphicsObject() {
    }
}