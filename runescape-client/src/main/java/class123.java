import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class123 {
   @ObfuscatedName("ab")
   public static final float field1459 = Math.ulp(1.0F);
   @ObfuscatedName("an")
   public static final float field1457;
   @ObfuscatedName("ao")
   static float[] field1460;
   @ObfuscatedName("av")
   static float[] field1461;
   @ObfuscatedName("ad")
   @Export("Widget_loadedInterfaces")
   static boolean[] Widget_loadedInterfaces;
   @ObfuscatedName("jk")
   @Export("regionLandArchiveIds")
   static int[] regionLandArchiveIds;

   static {
      field1457 = 2.0F * field1459;
      field1460 = new float[4];
      field1461 = new float[5];
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;Lne;Lne;I)V",
      garbageValue = "-354426867"
   )
   public static void method2911(AbstractArchive var0, AbstractArchive var1, AbstractArchive var2, AbstractArchive var3) {
      MouseRecorder.Widget_archive = var0;
      class211.field2337 = var1;
      MusicPatch.Widget_spritesArchive = var2;
      AbstractWorldMapData.Widget_fontsArchive = var3;
      class155.Widget_interfaceComponents = new Widget[MouseRecorder.Widget_archive.getGroupCount()][];
      Widget_loadedInterfaces = new boolean[MouseRecorder.Widget_archive.getGroupCount()];
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhd;",
      garbageValue = "-108"
   )
   @Export("WorldMapElement_get")
   public static WorldMapElement WorldMapElement_get(int var0) {
      return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
   }

   @ObfuscatedName("ig")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1101388613"
   )
   static void method2923() {
      for(class207 var0 = (class207)Client.field692.last(); var0 != null; var0 = (class207)Client.field692.previous()) {
         var0.remove();
      }

   }

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V",
      garbageValue = "7"
   )
   static final void method2924(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      class351.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
   }
}
