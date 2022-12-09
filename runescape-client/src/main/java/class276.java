import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
public class class276 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3170 = new class276(4);
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3158 = new class276(5);
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3159 = new class276(6);
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3171 = new class276(15);
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3161 = new class276(4);
   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3166 = new class276(2);
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3168 = new class276(7);
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3164 = new class276(16);
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3165 = new class276(8);
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3157 = new class276(5);
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3167 = new class276(14);
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3160 = new class276(5);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3169 = new class276(7);
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Ljn;"
   )
   public static final class276 field3163 = new class276(14);

   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "4"
   )
   class276(int var1) {
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2126981871"
   )
   @Export("getGcDuration")
   protected static int getGcDuration() {
      int var0 = 0;
      if (Projectile.garbageCollector == null || !Projectile.garbageCollector.isValid()) {
         try {
            Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var1.hasNext()) {
               GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
               if (var2.isValid()) {
                  Projectile.garbageCollector = var2;
                  GameEngine.garbageCollectorLastCheckTimeMs = -1L;
                  GameEngine.garbageCollectorLastCollectionTime = -1L;
               }
            }
         } catch (Throwable var11) {
         }
      }

      if (Projectile.garbageCollector != null) {
         long var9 = Message.method1197();
         long var3 = Projectile.garbageCollector.getCollectionTime();
         if (GameEngine.garbageCollectorLastCollectionTime != -1L) {
            long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
            long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
            if (0L != var7) {
               var0 = (int)(var5 * 100L / var7);
            }
         }

         GameEngine.garbageCollectorLastCollectionTime = var3;
         GameEngine.garbageCollectorLastCheckTimeMs = var9;
      }

      return var0;
   }

   @ObfuscatedName("jf")
   @ObfuscatedSignature(
      descriptor = "(Lbs;IIB)V",
      garbageValue = "-92"
   )
   static final void method5485(MenuAction var0, int var1, int var2) {
      if (var0 != null) {
         WorldMapData_0.menuAction(var0.param0, var0.param1, var0.opcode, var0.identifier, var0.itemId, var0.action, var0.target, var1, var2);
      }

   }
}
