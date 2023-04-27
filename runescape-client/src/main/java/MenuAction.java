import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cb")
@Implements("MenuAction")
public class MenuAction {
   @ObfuscatedName("qh")
   @ObfuscatedSignature(
      descriptor = "Lsu;"
   )
   @Export("HitSplatDefinition_cached")
   static class473 HitSplatDefinition_cached;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 68640743
   )
   @Export("param0")
   int param0;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1427372077
   )
   @Export("param1")
   int param1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 532700261
   )
   @Export("opcode")
   int opcode;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1480765569
   )
   @Export("identifier")
   int identifier;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 680599237
   )
   @Export("itemId")
   int itemId;
   @ObfuscatedName("ab")
   @Export("action")
   String action;
   @ObfuscatedName("aq")
   @Export("target")
   String target;

   MenuAction() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I[BLqk;B)V",
      garbageValue = "73"
   )
   static void method2041(int var0, byte[] var1, ArchiveDisk var2) {
      ArchiveDiskAction var3 = new ArchiveDiskAction();
      var3.type = 0;
      var3.key = (long)var0;
      var3.data = var1;
      var3.archiveDisk = var2;
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
         ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
      }

      class124.method3057();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;I)V",
      garbageValue = "1515081265"
   )
   public static void method2040(AbstractArchive var0, AbstractArchive var1) {
      NPCComposition.NpcDefinition_archive = var0;
      NPCComposition.field2006 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;I)V",
      garbageValue = "-1939733213"
   )
   public static void method2043(AbstractArchive var0) {
      VarbitComposition.VarbitDefinition_archive = var0;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "-2123095492"
   )
   @Export("isAlphaNumeric")
   public static boolean isAlphaNumeric(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   @ObfuscatedName("kz")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
      garbageValue = "116"
   )
   @Export("insertMenuItemNoShift")
   public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
      SceneTilePaint.insertMenuItem(var0, var1, var2, var3, var4, var5, -1, false);
   }
}
