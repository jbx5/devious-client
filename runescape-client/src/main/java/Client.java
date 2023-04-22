import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONException;
import org.json.JSONObject;

@Implements("Client")
@ObfuscatedName("client")
public final class Client extends GameEngine implements Usernamed, OAuthApi {
   @ObfuscatedName("vd")
   @ObfuscatedGetter(
      intValue = -82629945
   )
   @Export("viewportOffsetX")
   static int viewportOffsetX;
   @ObfuscatedName("vx")
   @ObfuscatedGetter(
      intValue = 1352043351
   )
   @Export("viewportOffsetY")
   static int viewportOffsetY;
   @ObfuscatedName("wn")
   @ObfuscatedGetter(
      intValue = -1680619819
   )
   public static int field781;
   @ObfuscatedName("xr")
   @ObfuscatedSignature(
      descriptor = "Lcm;"
   )
   static final ApproximateRouteStrategy field786;
   @ObfuscatedName("xm")
   static int[] field787;
   @ObfuscatedName("xn")
   static int[] field788;
   @ObfuscatedName("vr")
   @ObfuscatedGetter(
      intValue = -1563612739
   )
   static int field772;
   @ObfuscatedName("vh")
   @ObfuscatedSignature(
      descriptor = "Lmw;"
   )
   @Export("playerAppearance")
   static PlayerComposition playerAppearance;
   @ObfuscatedName("vu")
   @ObfuscatedGetter(
      intValue = -1618425081
   )
   static int field773;
   @ObfuscatedName("uj")
   @Export("isCameraLocked")
   static boolean isCameraLocked;
   @ObfuscatedName("uk")
   static boolean field731;
   @ObfuscatedName("ub")
   static boolean field673;
   @ObfuscatedName("we")
   @Export("archiveLoaders")
   static ArrayList archiveLoaders;
   @ObfuscatedName("wq")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("DBTableIndex_cache")
   static EvictingDualNodeHashTable DBTableIndex_cache;
   @ObfuscatedName("ww")
   @ObfuscatedSignature(
      descriptor = "Lkh;"
   )
   @Export("DBTableMasterIndex_cache")
   static EvictingDualNodeHashTable DBTableMasterIndex_cache;
   @ObfuscatedName("wy")
   @ObfuscatedGetter(
      intValue = -397497277
   )
   @Export("archiveLoadersDone")
   static int archiveLoadersDone;
   @ObfuscatedName("ud")
   static boolean field748;
   @ObfuscatedName("wx")
   @ObfuscatedSignature(
      descriptor = "Lpk;"
   )
   @Export("archive5")
   static class398 archive5;
   @ObfuscatedName("vc")
   @ObfuscatedSignature(
      descriptor = "Lrz;"
   )
   @Export("platformInfoProvider")
   static PlatformInfoProvider platformInfoProvider;
   @ObfuscatedName("tg")
   @Export("queuedSoundEffectDelays")
   static int[] queuedSoundEffectDelays;
   @ObfuscatedName("ti")
   @ObfuscatedSignature(
      descriptor = "[Lbs;"
   )
   @Export("soundEffects")
   static SoundEffect[] soundEffects;
   @ObfuscatedName("ui")
   @ObfuscatedSignature(
      descriptor = "Lrm;"
   )
   static class455 field667;
   @ObfuscatedName("tb")
   @Export("soundLocations")
   static int[] soundLocations;
   @ObfuscatedName("vs")
   @ObfuscatedSignature(
      descriptor = "[Lnb;"
   )
   @Export("grandExchangeOffers")
   static GrandExchangeOffer[] grandExchangeOffers;
   @ObfuscatedName("vv")
   static short field758;
   @ObfuscatedName("va")
   static short field759;
   @ObfuscatedName("vo")
   static short field620;
   @ObfuscatedName("vk")
   static short field694;
   @ObfuscatedName("vn")
   static short field763;
   @ObfuscatedName("vi")
   @ObfuscatedGetter(
      intValue = -1114517553
   )
   @Export("viewportZoom")
   static int viewportZoom;
   @ObfuscatedName("vm")
   static short field572;
   @ObfuscatedName("vp")
   @ObfuscatedGetter(
      intValue = 433849721
   )
   @Export("viewportWidth")
   static int viewportWidth;
   @ObfuscatedName("vy")
   @ObfuscatedGetter(
      intValue = 2042096749
   )
   @Export("viewportHeight")
   static int viewportHeight;
   @ObfuscatedName("ue")
   static boolean[] field753;
   @ObfuscatedName("vq")
   static int[] field754;
   @ObfuscatedName("vw")
   static int[] field776;
   @ObfuscatedName("vf")
   static int[] field631;
   @ObfuscatedName("vg")
   static int[] field584;
   @ObfuscatedName("vl")
   @Export("zoomHeight")
   static short zoomHeight;
   @ObfuscatedName("ve")
   @Export("zoomWidth")
   static short zoomWidth;
   @ObfuscatedName("uc")
   static boolean field747;
   @ObfuscatedName("ws")
   @ObfuscatedGetter(
      intValue = 1240602605
   )
   static int field529;
   @ObfuscatedName("uz")
   @ObfuscatedSignature(
      descriptor = "Lrf;"
   )
   static class454 field737;
   @ObfuscatedName("ua")
   @ObfuscatedSignature(
      descriptor = "Lrf;"
   )
   static class454 field750;
   @ObfuscatedName("wg")
   @ObfuscatedSignature(
      descriptor = "Lcf;"
   )
   @Export("GrandExchangeEvents_worldComparator")
   static GrandExchangeOfferOwnWorldComparator GrandExchangeEvents_worldComparator;
   @ObfuscatedName("wi")
   @ObfuscatedGetter(
      intValue = -1334952277
   )
   static int field746;
   @ObfuscatedName("wz")
   static List field782;
   @ObfuscatedName("bh")
   static boolean field603 = true;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = -453810525
   )
   @Export("worldId")
   public static int worldId = 1;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = -205173751
   )
   @Export("worldProperties")
   static int worldProperties = 0;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = -1274626977
   )
   @Export("gameBuild")
   static int gameBuild = 0;
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Lmr;"
   )
   static StudioGame field490;
   @ObfuscatedName("ca")
   @Export("isMembersWorld")
   public static boolean isMembersWorld = false;
   @ObfuscatedName("cu")
   @Export("isLowDetail")
   static boolean isLowDetail = false;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 976454555
   )
   static int field493 = -1;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = -749752677
   )
   @Export("clientType")
   static int clientType = -1;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 838232771
   )
   static int field495 = -1;
   @ObfuscatedName("cy")
   @Export("onMobile")
   static boolean onMobile = false;
   @ObfuscatedName("cx")
   @ObfuscatedGetter(
      intValue = -1931866699
   )
   static int field497 = 213;
   @ObfuscatedName("dw")
   @ObfuscatedGetter(
      intValue = -1275976559
   )
   @Export("gameState")
   static int gameState = 0;
   @ObfuscatedName("da")
   @Export("isLoading")
   static boolean isLoading = true;
   @ObfuscatedName("ep")
   @ObfuscatedGetter(
      intValue = -1886224337
   )
   @Export("cycle")
   static int cycle = 0;
   @ObfuscatedName("eo")
   @ObfuscatedGetter(
      longValue = -2243792022961482123L
   )
   @Export("mouseLastLastPressedTimeMillis")
   static long mouseLastLastPressedTimeMillis = 1L;
   @ObfuscatedName("et")
   @ObfuscatedGetter(
      intValue = -751176573
   )
   static int field502 = -1;
   @ObfuscatedName("ef")
   @ObfuscatedGetter(
      intValue = -2076298705
   )
   static int field503 = -1;
   @ObfuscatedName("ez")
   @ObfuscatedGetter(
      longValue = 8511124946921102523L
   )
   static long field604 = -1L;
   @ObfuscatedName("ej")
   @Export("hadFocus")
   static boolean hadFocus = true;
   @ObfuscatedName("ea")
   @ObfuscatedGetter(
      intValue = -1496573241
   )
   @Export("rebootTimer")
   static int rebootTimer = 0;
   @ObfuscatedName("eu")
   @ObfuscatedGetter(
      intValue = 633821975
   )
   @Export("hintArrowType")
   static int hintArrowType = 0;
   @ObfuscatedName("es")
   @ObfuscatedGetter(
      intValue = 920558921
   )
   @Export("hintArrowNpcIndex")
   static int hintArrowNpcIndex = 0;
   @ObfuscatedName("eb")
   @ObfuscatedGetter(
      intValue = 561980131
   )
   @Export("hintArrowPlayerIndex")
   static int hintArrowPlayerIndex = 0;
   @ObfuscatedName("el")
   @ObfuscatedGetter(
      intValue = -1178855237
   )
   @Export("hintArrowX")
   static int hintArrowX = 0;
   @ObfuscatedName("en")
   @ObfuscatedGetter(
      intValue = 796703205
   )
   @Export("hintArrowY")
   static int hintArrowY = 0;
   @ObfuscatedName("er")
   @ObfuscatedGetter(
      intValue = -1775632596
   )
   @Export("hintArrowHeight")
   static int hintArrowHeight = 0;
   @ObfuscatedName("eg")
   @ObfuscatedGetter(
      intValue = 1919998784
   )
   @Export("hintArrowSubX")
   static int hintArrowSubX = 0;
   @ObfuscatedName("ed")
   @ObfuscatedGetter(
      intValue = 1794412864
   )
   @Export("hintArrowSubY")
   static int hintArrowSubY = 0;
   @ObfuscatedName("em")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   @Export("playerAttackOption")
   static AttackOption playerAttackOption;
   @ObfuscatedName("ew")
   @ObfuscatedSignature(
      descriptor = "Ldj;"
   )
   @Export("npcAttackOption")
   static AttackOption npcAttackOption;
   @ObfuscatedName("ex")
   @Export("renderSelf")
   static boolean renderSelf;
   @ObfuscatedName("fi")
   @ObfuscatedGetter(
      intValue = -627796577
   )
   @Export("titleLoadingStage")
   static int titleLoadingStage;
   @ObfuscatedName("fp")
   @ObfuscatedGetter(
      intValue = -1348062367
   )
   @Export("js5ConnectState")
   static int js5ConnectState;
   @ObfuscatedName("fo")
   @ObfuscatedGetter(
      intValue = -95141699
   )
   static int field520;
   @ObfuscatedName("gj")
   @ObfuscatedGetter(
      intValue = -1027638623
   )
   @Export("js5Errors")
   static int js5Errors;
   @ObfuscatedName("ge")
   @ObfuscatedGetter(
      intValue = 572310033
   )
   @Export("loginState")
   static int loginState;
   @ObfuscatedName("ga")
   @ObfuscatedGetter(
      intValue = -1687986373
   )
   static int field523;
   @ObfuscatedName("gt")
   @ObfuscatedGetter(
      intValue = -858790111
   )
   static int field524;
   @ObfuscatedName("gu")
   @ObfuscatedGetter(
      intValue = 1922908789
   )
   static int field525;
   @ObfuscatedName("gh")
   @ObfuscatedSignature(
      descriptor = "Lfp;"
   )
   static class135 field526;
   @ObfuscatedName("gy")
   @ObfuscatedSignature(
      descriptor = "Lsr;"
   )
   static class493 field527;
   @ObfuscatedName("hd")
   static final String field537;
   @ObfuscatedName("hb")
   @Export("Login_isUsernameRemembered")
   static boolean Login_isUsernameRemembered;
   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "Lcj;"
   )
   @Export("secureRandomFuture")
   static SecureRandomFuture secureRandomFuture;
   @ObfuscatedName("hf")
   @Export("randomDatData")
   static byte[] randomDatData;
   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      descriptor = "[Ldf;"
   )
   @Export("npcs")
   static NPC[] npcs;
   @ObfuscatedName("iw")
   @ObfuscatedGetter(
      intValue = 265474485
   )
   @Export("npcCount")
   static int npcCount;
   @ObfuscatedName("iy")
   @Export("npcIndices")
   static int[] npcIndices;
   @ObfuscatedName("ig")
   @ObfuscatedGetter(
      intValue = 606834121
   )
   static int field548;
   @ObfuscatedName("ih")
   static int[] field549;
   @ObfuscatedName("in")
   @ObfuscatedSignature(
      descriptor = "Leq;"
   )
   @Export("packetWriter")
   public static final PacketWriter packetWriter;
   @ObfuscatedName("ii")
   @ObfuscatedGetter(
      intValue = 1705142349
   )
   @Export("logoutTimer")
   static int logoutTimer;
   @ObfuscatedName("ik")
   @Export("hadNetworkError")
   static boolean hadNetworkError;
   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      descriptor = "Lor;"
   )
   @Export("timer")
   static Timer timer;
   @ObfuscatedName("im")
   @Export("fontsMap")
   static HashMap fontsMap;
   @ObfuscatedName("it")
   static String field496;
   @ObfuscatedName("jx")
   @ObfuscatedGetter(
      intValue = -215929647
   )
   static int field559;
   @ObfuscatedName("jo")
   @ObfuscatedGetter(
      intValue = 817023789
   )
   static int field725;
   @ObfuscatedName("jk")
   @ObfuscatedGetter(
      intValue = 1372828241
   )
   static int field557;
   @ObfuscatedName("jq")
   @ObfuscatedGetter(
      intValue = 1233759319
   )
   static int field558;
   @ObfuscatedName("je")
   @ObfuscatedGetter(
      intValue = -2139010133
   )
   static int field621;
   @ObfuscatedName("jr")
   @ObfuscatedSignature(
      descriptor = "[Lif;"
   )
   @Export("collisionMaps")
   static CollisionMap[] collisionMaps;
   @ObfuscatedName("jv")
   @Export("isInInstance")
   static boolean isInInstance;
   @ObfuscatedName("jh")
   @Export("instanceChunkTemplates")
   static int[][][] instanceChunkTemplates;
   @ObfuscatedName("jy")
   static final int[] field563;
   @ObfuscatedName("ja")
   @ObfuscatedGetter(
      intValue = -1795081153
   )
   @Export("graphicsCycle")
   static int graphicsCycle;
   @ObfuscatedName("kq")
   @ObfuscatedGetter(
      intValue = 40021093
   )
   static int field575;
   @ObfuscatedName("kw")
   @ObfuscatedGetter(
      intValue = 992783339
   )
   static int field583;
   @ObfuscatedName("kk")
   @ObfuscatedGetter(
      intValue = 1155936455
   )
   static int field567;
   @ObfuscatedName("kj")
   @ObfuscatedGetter(
      intValue = 1881503647
   )
   static int field568;
   @ObfuscatedName("ki")
   static boolean field569;
   @ObfuscatedName("ko")
   @ObfuscatedGetter(
      intValue = -1434295667
   )
   @Export("alternativeScrollbarWidth")
   static int alternativeScrollbarWidth;
   @ObfuscatedName("kp")
   @ObfuscatedGetter(
      intValue = -954734641
   )
   @Export("camAngleX")
   static int camAngleX;
   @ObfuscatedName("kf")
   @ObfuscatedGetter(
      intValue = 704283033
   )
   @Export("camAngleY")
   static int camAngleY;
   @ObfuscatedName("ks")
   @ObfuscatedGetter(
      intValue = 1977625303
   )
   @Export("camAngleDY")
   static int camAngleDY;
   @ObfuscatedName("kn")
   @ObfuscatedGetter(
      intValue = 1441154731
   )
   @Export("camAngleDX")
   static int camAngleDX;
   @ObfuscatedName("kz")
   @ObfuscatedGetter(
      intValue = -1491948821
   )
   static int field579;
   @ObfuscatedName("km")
   @ObfuscatedGetter(
      intValue = 332197605
   )
   @Export("mouseCamClickedY")
   static int mouseCamClickedY;
   @ObfuscatedName("lv")
   @ObfuscatedGetter(
      intValue = 986256295
   )
   @Export("oculusOrbState")
   static int oculusOrbState;
   @ObfuscatedName("lm")
   @ObfuscatedGetter(
      intValue = 394960243
   )
   @Export("camFollowHeight")
   static int camFollowHeight;
   @ObfuscatedName("li")
   @ObfuscatedGetter(
      intValue = -1277774705
   )
   static int field777;
   @ObfuscatedName("lu")
   @ObfuscatedGetter(
      intValue = 1382999863
   )
   static int field728;
   @ObfuscatedName("lk")
   @ObfuscatedGetter(
      intValue = -168443219
   )
   static int field530;
   @ObfuscatedName("la")
   @ObfuscatedGetter(
      intValue = 1101365113
   )
   @Export("oculusOrbNormalSpeed")
   static int oculusOrbNormalSpeed;
   @ObfuscatedName("lp")
   @ObfuscatedGetter(
      intValue = 519949591
   )
   @Export("oculusOrbSlowedSpeed")
   static int oculusOrbSlowedSpeed;
   @ObfuscatedName("ly")
   @ObfuscatedGetter(
      intValue = 1263827259
   )
   public static int field576;
   @ObfuscatedName("ln")
   static boolean field585;
   @ObfuscatedName("lt")
   @ObfuscatedGetter(
      intValue = -1504372859
   )
   static int field618;
   @ObfuscatedName("lz")
   static boolean field756;
   @ObfuscatedName("lc")
   @ObfuscatedGetter(
      intValue = 205350563
   )
   static int field588;
   @ObfuscatedName("ld")
   @ObfuscatedGetter(
      intValue = 734988573
   )
   @Export("overheadTextCount")
   static int overheadTextCount;
   @ObfuscatedName("lq")
   @ObfuscatedGetter(
      intValue = 1025553311
   )
   @Export("overheadTextLimit")
   static int overheadTextLimit;
   @ObfuscatedName("lj")
   @Export("overheadTextXs")
   static int[] overheadTextXs;
   @ObfuscatedName("ll")
   @Export("overheadTextYs")
   static int[] overheadTextYs;
   @ObfuscatedName("le")
   @Export("overheadTextAscents")
   static int[] overheadTextAscents;
   @ObfuscatedName("lb")
   @Export("overheadTextXOffsets")
   static int[] overheadTextXOffsets;
   @ObfuscatedName("lx")
   @Export("overheadTextColors")
   static int[] overheadTextColors;
   @ObfuscatedName("lo")
   @Export("overheadTextEffects")
   static int[] overheadTextEffects;
   @ObfuscatedName("lw")
   @Export("overheadTextCyclesRemaining")
   static int[] overheadTextCyclesRemaining;
   @ObfuscatedName("lr")
   @Export("overheadText")
   static String[] overheadText;
   @ObfuscatedName("mt")
   @Export("tileLastDrawnActor")
   static int[][] tileLastDrawnActor;
   @ObfuscatedName("mw")
   @ObfuscatedGetter(
      intValue = 2041464667
   )
   @Export("viewportDrawCount")
   static int viewportDrawCount;
   @ObfuscatedName("mz")
   @ObfuscatedGetter(
      intValue = -1848743379
   )
   @Export("viewportTempX")
   static int viewportTempX;
   @ObfuscatedName("mu")
   @ObfuscatedGetter(
      intValue = 318977283
   )
   @Export("viewportTempY")
   static int viewportTempY;
   @ObfuscatedName("mq")
   @ObfuscatedGetter(
      intValue = -902574261
   )
   @Export("mouseCrossX")
   static int mouseCrossX;
   @ObfuscatedName("mm")
   @ObfuscatedGetter(
      intValue = 682495699
   )
   @Export("mouseCrossY")
   static int mouseCrossY;
   @ObfuscatedName("me")
   @ObfuscatedGetter(
      intValue = 206698708
   )
   @Export("mouseCrossState")
   static int mouseCrossState;
   @ObfuscatedName("mv")
   @ObfuscatedGetter(
      intValue = -1306273505
   )
   @Export("mouseCrossColor")
   static int mouseCrossColor;
   @ObfuscatedName("mx")
   @Export("showMouseCross")
   static boolean showMouseCross;
   @ObfuscatedName("ma")
   @ObfuscatedGetter(
      intValue = 43311027
   )
   static int field608;
   @ObfuscatedName("mj")
   @Export("showLoadingMessages")
   static boolean showLoadingMessages;
   @ObfuscatedName("mc")
   @ObfuscatedSignature(
      descriptor = "[Ldv;"
   )
   @Export("players")
   static Player[] players;
   @ObfuscatedName("mg")
   @ObfuscatedGetter(
      intValue = -549033243
   )
   @Export("localPlayerIndex")
   static int localPlayerIndex;
   @ObfuscatedName("mo")
   @ObfuscatedGetter(
      intValue = -1811511707
   )
   static int field612;
   @ObfuscatedName("mn")
   @ObfuscatedGetter(
      longValue = -1749026863537138247L
   )
   static long field613;
   @ObfuscatedName("md")
   static boolean field614;
   @ObfuscatedName("mk")
   @ObfuscatedGetter(
      intValue = -1387790283
   )
   @Export("drawPlayerNames")
   static int drawPlayerNames;
   @ObfuscatedName("mb")
   @ObfuscatedGetter(
      intValue = 216061641
   )
   static int field616;
   @ObfuscatedName("nz")
   static int[] field617;
   @ObfuscatedName("ns")
   @Export("playerMenuOpcodes")
   static final int[] playerMenuOpcodes;
   @ObfuscatedName("nd")
   @Export("playerMenuActions")
   static String[] playerMenuActions;
   @ObfuscatedName("no")
   @Export("playerOptionsPriorities")
   static boolean[] playerOptionsPriorities;
   @ObfuscatedName("nm")
   static int[] defaultRotations;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -1565733637
   )
   @Export("combatTargetPlayerIndex")
   static int combatTargetPlayerIndex;
   @ObfuscatedName("nr")
   @ObfuscatedSignature(
      descriptor = "[[[Lnh;"
   )
   @Export("groundItems")
   static NodeDeque[][][] groundItems;
   @ObfuscatedName("nn")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("pendingSpawns")
   static NodeDeque pendingSpawns;
   @ObfuscatedName("na")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("projectiles")
   static NodeDeque projectiles;
   @ObfuscatedName("np")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("graphicsObjects")
   static NodeDeque graphicsObjects;
   @ObfuscatedName("ng")
   @Export("currentLevels")
   static int[] currentLevels;
   @ObfuscatedName("ny")
   @Export("levels")
   static int[] levels;
   @ObfuscatedName("nu")
   @Export("experience")
   static int[] experience;
   @ObfuscatedName("nb")
   @Export("leftClickOpensMenu")
   static boolean leftClickOpensMenu;
   @ObfuscatedName("nt")
   @Export("isMenuOpen")
   static boolean isMenuOpen;
   @ObfuscatedName("ne")
   @ObfuscatedGetter(
      intValue = 730065501
   )
   @Export("menuOptionsCount")
   static int menuOptionsCount;
   @ObfuscatedName("nk")
   @Export("menuArguments1")
   static int[] menuArguments1;
   @ObfuscatedName("ni")
   @Export("menuArguments2")
   static int[] menuArguments2;
   @ObfuscatedName("nh")
   @Export("menuOpcodes")
   static int[] menuOpcodes;
   @ObfuscatedName("nq")
   @Export("menuIdentifiers")
   static int[] menuIdentifiers;
   @ObfuscatedName("oi")
   @Export("menuItemIds")
   static int[] menuItemIds;
   @ObfuscatedName("og")
   @Export("menuActions")
   static String[] menuActions;
   @ObfuscatedName("ok")
   @Export("menuTargets")
   static String[] menuTargets;
   @ObfuscatedName("ox")
   @Export("menuShiftClick")
   static boolean[] menuShiftClick;
   @ObfuscatedName("ov")
   @Export("followerOpsLowPriority")
   static boolean followerOpsLowPriority;
   @ObfuscatedName("ol")
   @Export("tapToDrop")
   static boolean tapToDrop;
   @ObfuscatedName("oz")
   @Export("showMouseOverText")
   static boolean showMouseOverText;
   @ObfuscatedName("of")
   @ObfuscatedGetter(
      intValue = -2086038621
   )
   @Export("viewportX")
   static int viewportX;
   @ObfuscatedName("oy")
   @ObfuscatedGetter(
      intValue = -870509993
   )
   @Export("viewportY")
   static int viewportY;
   @ObfuscatedName("oe")
   @ObfuscatedGetter(
      intValue = 215597333
   )
   static int field646;
   @ObfuscatedName("on")
   @ObfuscatedGetter(
      intValue = 1239377975
   )
   static int field647;
   @ObfuscatedName("oq")
   @ObfuscatedGetter(
      intValue = -303899309
   )
   @Export("isItemSelected")
   static int isItemSelected;
   @ObfuscatedName("om")
   @Export("isSpellSelected")
   static boolean isSpellSelected;
   @ObfuscatedName("oa")
   @ObfuscatedGetter(
      intValue = 145251849
   )
   @Export("selectedSpellChildIndex")
   static int selectedSpellChildIndex;
   @ObfuscatedName("op")
   @ObfuscatedGetter(
      intValue = 616923277
   )
   @Export("selectedSpellItemId")
   static int selectedSpellItemId;
   @ObfuscatedName("oj")
   @Export("selectedSpellActionName")
   static String selectedSpellActionName;
   @ObfuscatedName("ob")
   @Export("selectedSpellName")
   static String selectedSpellName;
   @ObfuscatedName("or")
   @ObfuscatedGetter(
      intValue = -896157613
   )
   @Export("rootInterface")
   static int rootInterface;
   @ObfuscatedName("oc")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   @Export("interfaceParents")
   static NodeHashTable interfaceParents;
   @ObfuscatedName("pc")
   @ObfuscatedGetter(
      intValue = -1722511035
   )
   static int field595;
   @ObfuscatedName("pp")
   @ObfuscatedGetter(
      intValue = -842617159
   )
   static int field658;
   @ObfuscatedName("py")
   @ObfuscatedGetter(
      intValue = 395188193
   )
   @Export("chatEffects")
   static int chatEffects;
   @ObfuscatedName("pg")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("meslayerContinueWidget")
   static Widget meslayerContinueWidget;
   @ObfuscatedName("pk")
   @ObfuscatedGetter(
      intValue = -365416549
   )
   @Export("runEnergy")
   static int runEnergy;
   @ObfuscatedName("pj")
   @ObfuscatedGetter(
      intValue = -1940722149
   )
   @Export("weight")
   static int weight;
   @ObfuscatedName("pu")
   @ObfuscatedGetter(
      intValue = 324465533
   )
   @Export("staffModLevel")
   public static int staffModLevel;
   @ObfuscatedName("pt")
   @ObfuscatedGetter(
      intValue = 2050107857
   )
   @Export("followerIndex")
   static int followerIndex;
   @ObfuscatedName("po")
   @Export("playerMod")
   static boolean playerMod;
   @ObfuscatedName("ps")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("viewportWidget")
   static Widget viewportWidget;
   @ObfuscatedName("pr")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("clickedWidget")
   static Widget clickedWidget;
   @ObfuscatedName("pf")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("clickedWidgetParent")
   static Widget clickedWidgetParent;
   @ObfuscatedName("pd")
   @ObfuscatedGetter(
      intValue = -1789924433
   )
   @Export("widgetClickX")
   static int widgetClickX;
   @ObfuscatedName("pw")
   @ObfuscatedGetter(
      intValue = 1902621241
   )
   @Export("widgetClickY")
   static int widgetClickY;
   @ObfuscatedName("pz")
   @ObfuscatedSignature(
      descriptor = "Lmq;"
   )
   @Export("draggedOnWidget")
   static Widget draggedOnWidget;
   @ObfuscatedName("pq")
   static boolean field672;
   @ObfuscatedName("pi")
   @ObfuscatedGetter(
      intValue = 1084046795
   )
   static int field627;
   @ObfuscatedName("pb")
   @ObfuscatedGetter(
      intValue = -746723443
   )
   static int field674;
   @ObfuscatedName("px")
   static boolean field755;
   @ObfuscatedName("ph")
   @ObfuscatedGetter(
      intValue = 565355253
   )
   static int field676;
   @ObfuscatedName("pv")
   @ObfuscatedGetter(
      intValue = 1136091355
   )
   static int field677;
   @ObfuscatedName("pn")
   @Export("isDraggingWidget")
   static boolean isDraggingWidget;
   @ObfuscatedName("qu")
   @ObfuscatedGetter(
      intValue = -1583613347
   )
   @Export("cycleCntr")
   static int cycleCntr;
   @ObfuscatedName("qr")
   @Export("changedVarps")
   static int[] changedVarps;
   @ObfuscatedName("qx")
   @ObfuscatedGetter(
      intValue = -261310919
   )
   @Export("changedVarpCount")
   static int changedVarpCount;
   @ObfuscatedName("qj")
   @Export("changedItemContainers")
   static int[] changedItemContainers;
   @ObfuscatedName("qc")
   @ObfuscatedGetter(
      intValue = -710491461
   )
   static int field683;
   @ObfuscatedName("qs")
   @Export("changedSkills")
   static int[] changedSkills;
   @ObfuscatedName("qf")
   @ObfuscatedGetter(
      intValue = -744210295
   )
   @Export("changedSkillsCount")
   static int changedSkillsCount;
   @ObfuscatedName("qt")
   static int[] field686;
   @ObfuscatedName("qn")
   @ObfuscatedGetter(
      intValue = 2106773395
   )
   static int field687;
   @ObfuscatedName("qb")
   @ObfuscatedGetter(
      intValue = -620063003
   )
   @Export("chatCycle")
   static int chatCycle;
   @ObfuscatedName("qg")
   @ObfuscatedGetter(
      intValue = -421621503
   )
   static int field689;
   @ObfuscatedName("qd")
   @ObfuscatedGetter(
      intValue = -1685007587
   )
   static int field690;
   @ObfuscatedName("qy")
   @ObfuscatedGetter(
      intValue = -1127640293
   )
   static int field691;
   @ObfuscatedName("qz")
   @ObfuscatedGetter(
      intValue = 2059493293
   )
   static int field692;
   @ObfuscatedName("qq")
   @ObfuscatedGetter(
      intValue = -1835030315
   )
   static int field762;
   @ObfuscatedName("qv")
   @ObfuscatedGetter(
      intValue = -2057735521
   )
   static int field768;
   @ObfuscatedName("qa")
   @ObfuscatedGetter(
      intValue = -440718331
   )
   static int field565;
   @ObfuscatedName("rd")
   @ObfuscatedGetter(
      intValue = -121753353
   )
   @Export("mouseWheelRotation")
   static int mouseWheelRotation;
   @ObfuscatedName("rl")
   @ObfuscatedSignature(
      descriptor = "Ltz;"
   )
   static class506 field697;
   @ObfuscatedName("rq")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   @Export("scriptEvents")
   static NodeDeque scriptEvents;
   @ObfuscatedName("rt")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   static NodeDeque field699;
   @ObfuscatedName("rp")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   static NodeDeque field700;
   @ObfuscatedName("re")
   @ObfuscatedSignature(
      descriptor = "Lnh;"
   )
   static NodeDeque field701;
   @ObfuscatedName("rv")
   @ObfuscatedSignature(
      descriptor = "Lrc;"
   )
   @Export("widgetFlags")
   static NodeHashTable widgetFlags;
   @ObfuscatedName("rr")
   @ObfuscatedGetter(
      intValue = -356793645
   )
   @Export("rootWidgetCount")
   static int rootWidgetCount;
   @ObfuscatedName("rs")
   @ObfuscatedGetter(
      intValue = 207148199
   )
   static int field659;
   @ObfuscatedName("rf")
   static boolean[] field705;
   @ObfuscatedName("rm")
   static boolean[] field706;
   @ObfuscatedName("rw")
   static boolean[] field651;
   @ObfuscatedName("rh")
   @Export("rootWidgetXs")
   static int[] rootWidgetXs;
   @ObfuscatedName("rb")
   @Export("rootWidgetYs")
   static int[] rootWidgetYs;
   @ObfuscatedName("ra")
   @Export("rootWidgetWidths")
   static int[] rootWidgetWidths;
   @ObfuscatedName("ri")
   @Export("rootWidgetHeights")
   static int[] rootWidgetHeights;
   @ObfuscatedName("rg")
   @ObfuscatedGetter(
      intValue = -1928160607
   )
   @Export("gameDrawingMode")
   static int gameDrawingMode;
   @ObfuscatedName("rj")
   @ObfuscatedGetter(
      longValue = -3223439394100928671L
   )
   static long field713;
   @ObfuscatedName("ro")
   @Export("isResizable")
   static boolean isResizable;
   @ObfuscatedName("sy")
   static int[] field715;
   @ObfuscatedName("sj")
   @ObfuscatedGetter(
      intValue = -1963411823
   )
   @Export("publicChatMode")
   static int publicChatMode;
   @ObfuscatedName("su")
   @ObfuscatedGetter(
      intValue = -839909513
   )
   @Export("tradeChatMode")
   static int tradeChatMode;
   @ObfuscatedName("ss")
   static String field718;
   @ObfuscatedName("st")
   static long[] crossWorldMessageIds;
   @ObfuscatedName("sf")
   @ObfuscatedGetter(
      intValue = 1960529059
   )
   static int crossWorldMessageIdsIndex;
   @ObfuscatedName("sh")
   @ObfuscatedSignature(
      descriptor = "Lhy;"
   )
   public static class207 field721;
   @ObfuscatedName("si")
   @ObfuscatedSignature(
      descriptor = "Lhe;"
   )
   static class205 field722;
   @ObfuscatedName("sm")
   @ObfuscatedGetter(
      intValue = -1685179677
   )
   static int field487;
   @ObfuscatedName("sk")
   static int[] field724;
   @ObfuscatedName("sz")
   static int[] field556;
   @ObfuscatedName("sc")
   @ObfuscatedGetter(
      longValue = 8736327498043665535L
   )
   static long field726;
   @ObfuscatedName("sg")
   @ObfuscatedSignature(
      descriptor = "[Lfj;"
   )
   @Export("currentClanSettings")
   static ClanSettings[] currentClanSettings;
   @ObfuscatedName("so")
   @ObfuscatedSignature(
      descriptor = "[Lgj;"
   )
   @Export("currentClanChannels")
   static ClanChannel[] currentClanChannels;
   @ObfuscatedName("sp")
   @ObfuscatedGetter(
      intValue = -2000567333
   )
   static int field729;
   @ObfuscatedName("sr")
   @ObfuscatedGetter(
      intValue = 1573101195
   )
   @Export("mapIconCount")
   static int mapIconCount;
   @ObfuscatedName("tw")
   @Export("mapIconXs")
   static int[] mapIconXs;
   @ObfuscatedName("ty")
   @Export("mapIconYs")
   static int[] mapIconYs;
   @ObfuscatedName("ts")
   @ObfuscatedSignature(
      descriptor = "[Ltq;"
   )
   @Export("mapIcons")
   static SpritePixels[] mapIcons;
   @ObfuscatedName("te")
   @ObfuscatedGetter(
      intValue = 1494100363
   )
   @Export("destinationX")
   static int destinationX;
   @ObfuscatedName("th")
   @ObfuscatedGetter(
      intValue = -1748014035
   )
   @Export("destinationY")
   static int destinationY;
   @ObfuscatedName("tp")
   @ObfuscatedGetter(
      intValue = 1383336963
   )
   @Export("minimapState")
   static int minimapState;
   @ObfuscatedName("tz")
   @ObfuscatedGetter(
      intValue = 1976903761
   )
   @Export("currentTrackGroupId")
   static int currentTrackGroupId;
   @ObfuscatedName("tf")
   @Export("playingJingle")
   static boolean playingJingle;
   @ObfuscatedName("tl")
   @ObfuscatedGetter(
      intValue = -297150195
   )
   @Export("soundEffectCount")
   static int soundEffectCount;
   @ObfuscatedName("tu")
   @Export("soundEffectIds")
   static int[] soundEffectIds;
   @ObfuscatedName("tr")
   @Export("queuedSoundEffectLoops")
   static int[] queuedSoundEffectLoops;
   @ObfuscatedName("gx")
   String field528;
   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "Lag;"
   )
   class14 field661;
   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "Lam;"
   )
   class18 field522;
   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "Lcom/jagex/oldscape/pub/OtlTokenRequester;"
   )
   OtlTokenRequester field531;
   @ObfuscatedName("hi")
   Future field532;
   @ObfuscatedName("hj")
   boolean field533 = false;
   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "Lam;"
   )
   class18 field542;
   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;"
   )
   RefreshAccessTokenRequester field551;
   @ObfuscatedName("hx")
   Future field536;
   @ObfuscatedName("ha")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   Buffer field541;
   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      descriptor = "Lal;"
   )
   class7 field553;
   @ObfuscatedName("he")
   @ObfuscatedGetter(
      longValue = -7932717541542796365L
   )
   long field543 = -1L;

   static {
      playerAttackOption = AttackOption.AttackOption_hidden;
      npcAttackOption = AttackOption.AttackOption_hidden;
      renderSelf = false;
      titleLoadingStage = 0;
      js5ConnectState = 0;
      field520 = 0;
      js5Errors = 0;
      loginState = 0;
      field523 = 0;
      field524 = 0;
      field525 = 0;
      field526 = class135.field1621;
      field527 = class493.field5048;
      field537 = WorldMapSectionType.method5427(PlayerComposition.method6083("com_jagex_auth_desktop_osrs:public"));
      Login_isUsernameRemembered = false;
      secureRandomFuture = new SecureRandomFuture();
      randomDatData = null;
      npcs = new NPC[65536];
      npcCount = 0;
      npcIndices = new int[65536];
      field548 = 0;
      field549 = new int[250];
      packetWriter = new PacketWriter();
      logoutTimer = 0;
      hadNetworkError = false;
      timer = new Timer();
      fontsMap = new HashMap();
      field559 = 0;
      field725 = 1;
      field557 = 0;
      field558 = 1;
      field621 = 0;
      collisionMaps = new CollisionMap[4];
      isInInstance = false;
      instanceChunkTemplates = new int[4][13][13];
      field563 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
      graphicsCycle = 0;
      field575 = 2301979;
      field583 = 5063219;
      field567 = 3353893;
      field568 = 7759444;
      field569 = false;
      alternativeScrollbarWidth = 0;
      camAngleX = 128;
      camAngleY = 0;
      camAngleDY = 0;
      camAngleDX = 0;
      field579 = 0;
      mouseCamClickedY = 0;
      oculusOrbState = 0;
      camFollowHeight = 50;
      field777 = 0;
      field728 = 0;
      field530 = 0;
      oculusOrbNormalSpeed = 12;
      oculusOrbSlowedSpeed = 6;
      field576 = 0;
      field585 = false;
      field618 = 0;
      field756 = false;
      field588 = 0;
      overheadTextCount = 0;
      overheadTextLimit = 50;
      overheadTextXs = new int[overheadTextLimit];
      overheadTextYs = new int[overheadTextLimit];
      overheadTextAscents = new int[overheadTextLimit];
      overheadTextXOffsets = new int[overheadTextLimit];
      overheadTextColors = new int[overheadTextLimit];
      overheadTextEffects = new int[overheadTextLimit];
      overheadTextCyclesRemaining = new int[overheadTextLimit];
      overheadText = new String[overheadTextLimit];
      tileLastDrawnActor = new int[104][104];
      viewportDrawCount = 0;
      viewportTempX = -1;
      viewportTempY = -1;
      mouseCrossX = 0;
      mouseCrossY = 0;
      mouseCrossState = 0;
      mouseCrossColor = 0;
      showMouseCross = true;
      field608 = 0;
      showLoadingMessages = true;
      players = new Player[2048];
      localPlayerIndex = -1;
      field612 = 0;
      field613 = -1L;
      field614 = true;
      drawPlayerNames = 0;
      field616 = 0;
      field617 = new int[1000];
      playerMenuOpcodes = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
      playerMenuActions = new String[8];
      playerOptionsPriorities = new boolean[8];
      defaultRotations = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
      combatTargetPlayerIndex = -1;
      groundItems = new NodeDeque[4][104][104];
      pendingSpawns = new NodeDeque();
      projectiles = new NodeDeque();
      graphicsObjects = new NodeDeque();
      currentLevels = new int[25];
      levels = new int[25];
      experience = new int[25];
      leftClickOpensMenu = false;
      isMenuOpen = false;
      menuOptionsCount = 0;
      menuArguments1 = new int[500];
      menuArguments2 = new int[500];
      menuOpcodes = new int[500];
      menuIdentifiers = new int[500];
      menuItemIds = new int[500];
      menuActions = new String[500];
      menuTargets = new String[500];
      menuShiftClick = new boolean[500];
      followerOpsLowPriority = false;
      tapToDrop = false;
      showMouseOverText = true;
      viewportX = -1;
      viewportY = -1;
      field646 = 0;
      field647 = 50;
      isItemSelected = 0;
      field496 = null;
      isSpellSelected = false;
      selectedSpellChildIndex = -1;
      selectedSpellItemId = -1;
      selectedSpellActionName = null;
      selectedSpellName = null;
      rootInterface = -1;
      interfaceParents = new NodeHashTable(8);
      field595 = 0;
      field658 = -1;
      chatEffects = 0;
      meslayerContinueWidget = null;
      runEnergy = 0;
      weight = 0;
      staffModLevel = 0;
      followerIndex = -1;
      playerMod = false;
      viewportWidget = null;
      clickedWidget = null;
      clickedWidgetParent = null;
      widgetClickX = 0;
      widgetClickY = 0;
      draggedOnWidget = null;
      field672 = false;
      field627 = -1;
      field674 = -1;
      field755 = false;
      field676 = -1;
      field677 = -1;
      isDraggingWidget = false;
      cycleCntr = 1;
      changedVarps = new int[32];
      changedVarpCount = 0;
      changedItemContainers = new int[32];
      field683 = 0;
      changedSkills = new int[32];
      changedSkillsCount = 0;
      field686 = new int[32];
      field687 = 0;
      chatCycle = 0;
      field689 = 0;
      field690 = 0;
      field691 = 0;
      field692 = 0;
      field762 = 0;
      field768 = 0;
      field565 = 0;
      mouseWheelRotation = 0;
      field697 = new class506();
      scriptEvents = new NodeDeque();
      field699 = new NodeDeque();
      field700 = new NodeDeque();
      field701 = new NodeDeque();
      widgetFlags = new NodeHashTable(512);
      rootWidgetCount = 0;
      field659 = -2;
      field705 = new boolean[100];
      field706 = new boolean[100];
      field651 = new boolean[100];
      rootWidgetXs = new int[100];
      rootWidgetYs = new int[100];
      rootWidgetWidths = new int[100];
      rootWidgetHeights = new int[100];
      gameDrawingMode = 0;
      field713 = 0L;
      isResizable = true;
      field715 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
      publicChatMode = 0;
      tradeChatMode = 0;
      field718 = "";
      crossWorldMessageIds = new long[100];
      crossWorldMessageIdsIndex = 0;
      field721 = new class207();
      field722 = new class205();
      field487 = 0;
      field724 = new int[128];
      field556 = new int[128];
      field726 = -1L;
      currentClanSettings = new ClanSettings[4];
      currentClanChannels = new ClanChannel[4];
      field729 = -1;
      mapIconCount = 0;
      mapIconXs = new int[1000];
      mapIconYs = new int[1000];
      mapIcons = new SpritePixels[1000];
      destinationX = 0;
      destinationY = 0;
      minimapState = 0;
      currentTrackGroupId = -1;
      playingJingle = false;
      soundEffectCount = 0;
      soundEffectIds = new int[50];
      queuedSoundEffectLoops = new int[50];
      queuedSoundEffectDelays = new int[50];
      soundLocations = new int[50];
      soundEffects = new SoundEffect[50];
      isCameraLocked = false;
      field673 = false;
      field747 = false;
      field748 = false;
      field667 = null;
      field750 = null;
      field737 = null;
      field731 = false;
      field753 = new boolean[5];
      field754 = new int[5];
      field776 = new int[5];
      field631 = new int[5];
      field584 = new int[5];
      field758 = 256;
      field759 = 205;
      zoomHeight = 256;
      zoomWidth = 320;
      field572 = 1;
      field763 = 32767;
      field620 = 1;
      field694 = 32767;
      viewportOffsetX = 0;
      viewportOffsetY = 0;
      viewportWidth = 0;
      viewportHeight = 0;
      viewportZoom = 0;
      playerAppearance = new PlayerComposition();
      field772 = -1;
      field773 = -1;
      platformInfoProvider = new DesktopPlatformInfoProvider();
      grandExchangeOffers = new GrandExchangeOffer[8];
      GrandExchangeEvents_worldComparator = new GrandExchangeOfferOwnWorldComparator();
      archive5 = new class398(8, class396.field4532);
      DBTableIndex_cache = new EvictingDualNodeHashTable(64);
      DBTableMasterIndex_cache = new EvictingDualNodeHashTable(64);
      field746 = -1;
      field781 = -1;
      field782 = new ArrayList();
      archiveLoaders = new ArrayList(10);
      archiveLoadersDone = 0;
      field529 = 0;
      field786 = new ApproximateRouteStrategy();
      field787 = new int[50];
      field788 = new int[50];
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "79"
   )
   @Export("resizeGame")
   protected final void resizeGame() {
      field713 = class96.method2634() + 500L;
      this.resizeJS();
      if (rootInterface != -1) {
         this.resizeRoot(true);
      }

   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "42"
   )
   @Export("setUp")
   protected final void setUp() {
      class134.method3181(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
      FriendsChat.worldPort = gameBuild == 0 ? 'ꩊ' : worldId + '鱀';
      class127.js5Port = gameBuild == 0 ? 443 : worldId + '썐';
      ItemContainer.currentPort = FriendsChat.worldPort;
      PlayerComposition.field3517 = class315.field3550;
      PlayerComposition.field3507 = class315.field3549;
      WorldMapIcon_0.field2956 = class315.field3551;
      class437.field4707 = class315.field3552;
      class14.urlRequester = new class108(this.field533, 213);
      this.setUpKeyboard();
      this.method649();
      class123.mouseWheel = this.mouseWheel();
      this.method523(field722, 0);
      this.method523(field721, 1);
      WorldMapID.masterDisk = new ArchiveDisk(255, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idx255File, 500000);
      class20.clientPreferences = class205.method4204();
      this.setUpClipboard();
      String var2 = ReflectionCheck.field269;
      class31.field174 = this;
      if (var2 != null) {
         class31.field175 = var2;
      }

      Decimator.setWindowedMode(class20.clientPreferences.method2471());
      World.friendSystem = new FriendSystem(class70.loginType);
      this.field661 = new class14("tokenRequest", 1, 1);
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2106306379"
   )
   @Export("doCycle")
   protected final void doCycle() {
      ++cycle;
      this.doCycleJs5();

      while(true) {
         ArchiveDiskAction var1;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            var1 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
         }

         if (var1 == null) {
            int var5;
            try {
               if (class297.musicPlayerStatus == 1) {
                  var5 = class475.midiPcmStream.method5867();
                  if (var5 > 0 && class475.midiPcmStream.isReady()) {
                     var5 -= class162.pcmSampleLength;
                     if (var5 < 0) {
                        var5 = 0;
                     }

                     class475.midiPcmStream.setPcmStreamVolume(var5);
                  } else {
                     class475.midiPcmStream.clear();
                     class475.midiPcmStream.removeAll();
                     if (class297.musicTrackArchive != null) {
                        class297.musicPlayerStatus = 2;
                     } else {
                        class297.musicPlayerStatus = 0;
                     }

                     RouteStrategy.musicTrack = null;
                     class297.soundCache = null;
                  }
               }
            } catch (Exception var8) {
               var8.printStackTrace();
               class475.midiPcmStream.clear();
               class297.musicPlayerStatus = 0;
               RouteStrategy.musicTrack = null;
               class297.soundCache = null;
               class297.musicTrackArchive = null;
            }

            class323.playPcmPlayers();
            field721.method4212();
            this.method540();
            synchronized(MouseHandler.MouseHandler_instance) {
               MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
               MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
               MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
               MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
               MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
               MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
               MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
               MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
               MouseHandler.MouseHandler_lastButtonVolatile = 0;
            }

            if (class123.mouseWheel != null) {
               var5 = class123.mouseWheel.useRotation();
               mouseWheelRotation = var5;
            }

            if (gameState == 0) {
               DevicePcmPlayerProvider.load();
               NPC.method2628();
            } else if (gameState == 5) {
               EnumComposition.loginScreen(this, Language.fontPlain11, WallDecoration.fontPlain12);
               DevicePcmPlayerProvider.load();
               NPC.method2628();
            } else if (gameState != 10 && gameState != 11) {
               if (gameState == 20) {
                  EnumComposition.loginScreen(this, Language.fontPlain11, WallDecoration.fontPlain12);
                  this.doCycleLoggedOut();
               } else if (gameState == 50) {
                  EnumComposition.loginScreen(this, Language.fontPlain11, WallDecoration.fontPlain12);
                  this.doCycleLoggedOut();
               } else if (gameState == 25) {
                  class27.method418();
               }
            } else {
               EnumComposition.loginScreen(this, Language.fontPlain11, WallDecoration.fontPlain12);
            }

            if (gameState == 30) {
               this.doCycleLoggedIn();
            } else if (gameState == 40 || gameState == 45) {
               this.doCycleLoggedOut();
            }

            return;
         }

         var1.archive.load(var1.archiveDisk, (int)var1.key, var1.data, false);
      }
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(ZS)V",
      garbageValue = "7737"
   )
   @Export("draw")
   protected final void draw(boolean var1) {
      boolean var2;
      label175: {
         try {
            if (class297.musicPlayerStatus == 2) {
               if (RouteStrategy.musicTrack == null) {
                  RouteStrategy.musicTrack = MusicTrack.readTrack(class297.musicTrackArchive, class379.musicTrackGroupId, VarpDefinition.musicTrackFileId);
                  if (RouteStrategy.musicTrack == null) {
                     var2 = false;
                     break label175;
                  }
               }

               if (class297.soundCache == null) {
                  class297.soundCache = new SoundCache(class297.soundEffectsArchive, class297.musicSamplesArchive);
               }

               if (class475.midiPcmStream.loadMusicTrack(RouteStrategy.musicTrack, class297.musicPatchesArchive, class297.soundCache, 22050)) {
                  class475.midiPcmStream.clearAll();
                  class475.midiPcmStream.setPcmStreamVolume(class100.musicTrackVolume);
                  class475.midiPcmStream.setMusicTrack(RouteStrategy.musicTrack, class120.musicTrackBoolean);
                  class297.musicPlayerStatus = 0;
                  RouteStrategy.musicTrack = null;
                  class297.soundCache = null;
                  class297.musicTrackArchive = null;
                  var2 = true;
                  break label175;
               }
            }
         } catch (Exception var6) {
            var6.printStackTrace();
            class475.midiPcmStream.clear();
            class297.musicPlayerStatus = 0;
            RouteStrategy.musicTrack = null;
            class297.soundCache = null;
            class297.musicTrackArchive = null;
         }

         var2 = false;
      }

      if (var2 && playingJingle && class28.pcmPlayer0 != null) {
         class28.pcmPlayer0.tryDiscard();
      }

      if ((gameState == 10 || gameState == 20 || gameState == 30) && field713 != 0L && class96.method2634() > field713) {
         Decimator.setWindowedMode(GrandExchangeOfferNameComparator.getWindowedMode());
      }

      int var4;
      if (var1) {
         for(var4 = 0; var4 < 100; ++var4) {
            field705[var4] = true;
         }
      }

      if (gameState == 0) {
         this.drawInitial(Login.Login_loadingPercent, Login.Login_loadingText, var1);
      } else if (gameState == 5) {
         class6.drawTitle(class137.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
      } else if (gameState != 10 && gameState != 11) {
         if (gameState == 20) {
            class6.drawTitle(class137.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
         } else if (gameState == 50) {
            class6.drawTitle(class137.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
         } else if (gameState == 25) {
            if (field621 == 1) {
               if (field559 > field725) {
                  field725 = field559;
               }

               var4 = (field725 * 50 - field559 * 50) / field725;
               WorldMapDecoration.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else if (field621 == 2) {
               if (field557 > field558) {
                  field558 = field557;
               }

               var4 = (field558 * 50 - field557 * 50) / field558 + 50;
               WorldMapDecoration.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
            } else {
               WorldMapDecoration.drawLoadingMessage("Loading - please wait.", false);
            }
         } else if (gameState == 30) {
            this.drawLoggedIn();
         } else if (gameState == 40) {
            WorldMapDecoration.drawLoadingMessage("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
         } else if (gameState == 45) {
            WorldMapDecoration.drawLoadingMessage("Please wait...", false);
         }
      } else {
         class6.drawTitle(class137.fontBold12, Language.fontPlain11, WallDecoration.fontPlain12);
      }

      if (gameState == 30 && gameDrawingMode == 0 && !var1 && !isResizable) {
         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            if (field706[var4]) {
               RouteStrategy.rasterProvider.draw(rootWidgetXs[var4], rootWidgetYs[var4], rootWidgetWidths[var4], rootWidgetHeights[var4]);
               field706[var4] = false;
            }
         }
      } else if (gameState > 0) {
         RouteStrategy.rasterProvider.drawFull(0, 0);

         for(var4 = 0; var4 < rootWidgetCount; ++var4) {
            field706[var4] = false;
         }
      }

   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-72974483"
   )
   @Export("kill0")
   protected final void kill0() {
      if (class373.varcs.hasUnwrittenChanges()) {
         class373.varcs.write();
      }

      if (UserComparator6.mouseRecorder != null) {
         UserComparator6.mouseRecorder.isRunning = false;
      }

      UserComparator6.mouseRecorder = null;
      packetWriter.close();
      GraphicsObject.method2025();
      class123.mouseWheel = null;
      if (class28.pcmPlayer0 != null) {
         class28.pcmPlayer0.shutdown();
      }

      if (HorizontalAlignment.pcmPlayer1 != null) {
         HorizontalAlignment.pcmPlayer1.shutdown();
      }

      class295.method5745();
      class144.method3252();
      if (class14.urlRequester != null) {
         class14.urlRequester.close();
         class14.urlRequester = null;
      }

      try {
         JagexCache.JagexCache_dat2File.close();

         for(int var1 = 0; var1 < JagexCache.idxCount; ++var1) {
            class370.JagexCache_idxFiles[var1].close();
         }

         JagexCache.JagexCache_idx255File.close();
         JagexCache.JagexCache_randomDat.close();
      } catch (Exception var3) {
      }

      this.field661.method181();
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1086551379"
   )
   protected final void vmethod1452() {
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-945273483"
   )
   boolean method1431() {
      return ModeWhere.field4347 != null && !ModeWhere.field4347.trim().isEmpty() && TileItem.field1318 != null && !TileItem.field1318.trim().isEmpty();
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "24"
   )
   boolean method1234() {
      return SpriteMask.field3475 != null && !SpriteMask.field3475.trim().isEmpty() && class121.field1471 != null && !class121.field1471.trim().isEmpty();
   }

   @ObfuscatedName("gx")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-2"
   )
   boolean method1235() {
      return this.field531 != null;
   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1706352658"
   )
   void method1236(String var1) throws IOException {
      HashMap var2 = new HashMap();
      var2.put("grant_type", "refresh_token");
      var2.put("scope", "gamesso.token.create");
      var2.put("refresh_token", var1);
      URL var3 = new URL(ViewportMouse.field2774 + "shield/oauth/token" + (new class438(var2)).method8348());
      class394 var4 = new class394();
      var4.method7645(field537);
      var4.method7627("Host", (new URL(ViewportMouse.field2774)).getHost());
      var4.method7634(class435.field4703);
      class9 var5 = class9.field45;
      RefreshAccessTokenRequester var6 = this.field551;
      if (var6 != null) {
         this.field536 = var6.request(var5.method71(), var3, var4.method7626(), "");
      } else {
         class10 var7 = new class10(var3, var5, var4, this.field533);
         this.field542 = this.field661.method179(var7);
      }
   }

   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1446006608"
   )
   void method1638(String var1) throws IOException {
      URL var2 = new URL(ViewportMouse.field2774 + "public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play");
      class394 var3 = new class394();
      var3.method7631(var1);
      class9 var4 = class9.field39;
      OtlTokenRequester var5 = this.field531;
      if (var5 != null) {
         this.field532 = var5.request(var4.method71(), var2, var3.method7626(), "");
      } else {
         class10 var6 = new class10(var2, var4, var3, this.field533);
         this.field522 = this.field661.method179(var6);
      }
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1474733588"
   )
   void method1238(String var1, String var2) throws IOException, JSONException {
      URL var3 = new URL(ViewportMouse.field2774 + "/game-session/v1/tokens");
      class10 var4 = new class10(var3, class9.field45, this.field533);
      var4.method84().method7631(var1);
      var4.method84().method7634(class435.field4703);
      JSONObject var5 = new JSONObject();
      var5.method8392("accountId", var2);
      var4.method97(new class437(var5));
      this.field522 = this.field661.method179(var4);
   }

   @ObfuscatedName("hj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-53"
   )
   @Export("doCycleJs5")
   void doCycleJs5() {
      if (gameState != 1000) {
         boolean var1 = Tile.method4412();
         if (!var1) {
            this.doCycleJs5Connect();
         }

      }
   }

   @ObfuscatedName("hm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-121494842"
   )
   @Export("doCycleJs5Connect")
   void doCycleJs5Connect() {
      if (NetCache.NetCache_crcMismatches >= 4) {
         this.error("js5crc");
         class138.updateGameState(1000);
      } else {
         if (NetCache.NetCache_ioExceptions >= 4) {
            if (gameState <= 5) {
               this.error("js5io");
               class138.updateGameState(1000);
               return;
            }

            field520 = 3000;
            NetCache.NetCache_ioExceptions = 3;
         }

         if (--field520 + 1 <= 0) {
            try {
               if (js5ConnectState == 0) {
                  WorldMapSection0.js5SocketTask = GameEngine.taskHandler.newSocketTask(UserComparator8.worldHost, ItemContainer.currentPort);
                  ++js5ConnectState;
               }

               if (js5ConnectState == 1) {
                  if (WorldMapSection0.js5SocketTask.status == 2) {
                     this.js5Error(-1);
                     return;
                  }

                  if (WorldMapSection0.js5SocketTask.status == 1) {
                     ++js5ConnectState;
                  }
               }

               if (js5ConnectState == 2) {
                  KitDefinition.js5Socket = class186.method3731((Socket)WorldMapSection0.js5SocketTask.result, 40000, 5000);
                  Buffer var1 = new Buffer(5);
                  var1.writeByte(15);
                  var1.writeInt(213);
                  KitDefinition.js5Socket.write(var1.array, 0, 5);
                  ++js5ConnectState;
                  class132.field1580 = class96.method2634();
               }

               if (js5ConnectState == 3) {
                  if (KitDefinition.js5Socket.available() > 0) {
                     int var5 = KitDefinition.js5Socket.readUnsignedByte();
                     if (var5 != 0) {
                        this.js5Error(var5);
                        return;
                     }

                     ++js5ConnectState;
                  } else if (class96.method2634() - class132.field1580 > 30000L) {
                     this.js5Error(-2);
                     return;
                  }
               }

               if (js5ConnectState == 4) {
                  AbstractSocket var10 = KitDefinition.js5Socket;
                  boolean var2 = gameState > 20;
                  if (NetCache.NetCache_socket != null) {
                     try {
                        NetCache.NetCache_socket.close();
                     } catch (Exception var8) {
                     }

                     NetCache.NetCache_socket = null;
                  }

                  NetCache.NetCache_socket = var10;
                  class177.method3617(var2);
                  NetCache.NetCache_responseHeaderBuffer.offset = 0;
                  Script.NetCache_currentResponse = null;
                  NetCache.NetCache_responseArchiveBuffer = null;
                  NetCache.field4253 = 0;

                  while(true) {
                     NetFileRequest var3 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first();
                     if (var3 == null) {
                        while(true) {
                           var3 = (NetFileRequest)NetCache.NetCache_pendingResponses.first();
                           if (var3 == null) {
                              if (NetCache.field4255 != 0) {
                                 try {
                                    Buffer var11 = new Buffer(4);
                                    var11.writeByte(4);
                                    var11.writeByte(NetCache.field4255);
                                    var11.writeShort(0);
                                    NetCache.NetCache_socket.write(var11.array, 0, 4);
                                 } catch (IOException var7) {
                                    try {
                                       NetCache.NetCache_socket.close();
                                    } catch (Exception var6) {
                                    }

                                    ++NetCache.NetCache_ioExceptions;
                                    NetCache.NetCache_socket = null;
                                 }
                              }

                              NetCache.NetCache_loadTime = 0;
                              NetCache.field4259 = class96.method2634();
                              WorldMapSection0.js5SocketTask = null;
                              KitDefinition.js5Socket = null;
                              js5ConnectState = 0;
                              js5Errors = 0;
                              return;
                           }

                           NetCache.NetCache_pendingWritesQueue.addLast(var3);
                           NetCache.NetCache_pendingWrites.put(var3, var3.key);
                           ++NetCache.NetCache_pendingWritesCount;
                           --NetCache.NetCache_pendingResponsesCount;
                        }
                     }

                     NetCache.NetCache_pendingPriorityWrites.put(var3, var3.key);
                     ++NetCache.NetCache_pendingPriorityWritesCount;
                     --NetCache.NetCache_pendingPriorityResponsesCount;
                  }
               }
            } catch (IOException var9) {
               this.js5Error(-3);
            }

         }
      }
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-19"
   )
   @Export("js5Error")
   void js5Error(int var1) {
      WorldMapSection0.js5SocketTask = null;
      KitDefinition.js5Socket = null;
      js5ConnectState = 0;
      if (FriendsChat.worldPort == ItemContainer.currentPort) {
         ItemContainer.currentPort = class127.js5Port;
      } else {
         ItemContainer.currentPort = FriendsChat.worldPort;
      }

      ++js5Errors;
      if (js5Errors >= 2 && (var1 == 7 || var1 == 9)) {
         if (gameState <= 5) {
            this.error("js5connect_full");
            class138.updateGameState(1000);
         } else {
            field520 = 3000;
         }
      } else if (js5Errors >= 2 && var1 == 6) {
         this.error("js5connect_outofdate");
         class138.updateGameState(1000);
      } else if (js5Errors >= 4) {
         if (gameState <= 5) {
            this.error("js5connect");
            class138.updateGameState(1000);
         } else {
            field520 = 3000;
         }
      }

   }

   @ObfuscatedName("hl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-564344594"
   )
   @Export("doCycleLoggedOut")
   final void doCycleLoggedOut() {
      AbstractSocket var1 = packetWriter.getSocket();
      PacketBuffer var2 = packetWriter.packetBuffer;

      try {
         if (loginState == 0) {
            if (class174.secureRandom == null && (secureRandomFuture.isDone() || field523 > 250)) {
               class174.secureRandom = secureRandomFuture.get();
               secureRandomFuture.shutdown();
               secureRandomFuture = null;
            }

            if (class174.secureRandom != null) {
               if (var1 != null) {
                  var1.close();
                  var1 = null;
               }

               class1.socketTask = null;
               hadNetworkError = false;
               field523 = 0;
               if (field527.method9347()) {
                  if (this.method1431()) {
                     try {
                        this.method1236(TileItem.field1318);
                        class284.method5687(21);
                     } catch (Throwable var23) {
                        class387.RunException_sendStackTrace((String)null, var23);
                        class315.getLoginError(65);
                        return;
                     }
                  } else {
                     if (!this.method1234()) {
                        class315.getLoginError(65);
                        return;
                     }

                     try {
                        this.method1238(SpriteMask.field3475, class121.field1471);
                        class284.method5687(20);
                     } catch (Exception var22) {
                        class387.RunException_sendStackTrace((String)null, var22);
                        class315.getLoginError(65);
                        return;
                     }
                  }
               } else {
                  class284.method5687(1);
               }
            }
         }

         class20 var25;
         if (loginState == 21) {
            if (this.field536 != null) {
               if (!this.field536.isDone()) {
                  return;
               }

               if (this.field536.isCancelled()) {
                  class315.getLoginError(65);
                  this.field536 = null;
                  return;
               }

               try {
                  RefreshAccessTokenResponse var3 = (RefreshAccessTokenResponse)this.field536.get();
                  if (!var3.isSuccess()) {
                     class315.getLoginError(65);
                     this.field536 = null;
                     return;
                  }

                  ModeWhere.field4347 = var3.getAccessToken();
                  TileItem.field1318 = var3.getRefreshToken();
                  this.field536 = null;
               } catch (Exception var21) {
                  class387.RunException_sendStackTrace((String)null, var21);
                  class315.getLoginError(65);
                  this.field536 = null;
                  return;
               }
            } else {
               if (this.field542 == null) {
                  class315.getLoginError(65);
                  return;
               }

               if (!this.field542.method269()) {
                  return;
               }

               if (this.field542.method266()) {
                  class387.RunException_sendStackTrace(this.field542.method268(), (Throwable)null);
                  class315.getLoginError(65);
                  this.field542 = null;
                  return;
               }

               var25 = this.field542.method270();
               if (var25.method296() != 200) {
                  class315.getLoginError(65);
                  this.field542 = null;
                  return;
               }

               field523 = 0;
               class437 var4 = new class437(var25.method298());

               try {
                  ModeWhere.field4347 = var4.method8332().getString("access_token");
                  TileItem.field1318 = var4.method8332().getString("refresh_token");
               } catch (Exception var20) {
                  class387.RunException_sendStackTrace("Error parsing tokens", var20);
                  class315.getLoginError(65);
                  this.field542 = null;
                  return;
               }
            }

            this.method1638(ModeWhere.field4347);
            class284.method5687(20);
         }

         if (loginState == 20) {
            if (this.field532 != null) {
               if (!this.field532.isDone()) {
                  return;
               }

               if (this.field532.isCancelled()) {
                  class315.getLoginError(65);
                  this.field532 = null;
                  return;
               }

               try {
                  OtlTokenResponse var26 = (OtlTokenResponse)this.field532.get();
                  if (!var26.isSuccess()) {
                     class315.getLoginError(65);
                     this.field532 = null;
                     return;
                  }

                  this.field528 = var26.getToken();
                  this.field532 = null;
               } catch (Exception var19) {
                  class387.RunException_sendStackTrace((String)null, var19);
                  class315.getLoginError(65);
                  this.field532 = null;
                  return;
               }
            } else {
               if (this.field522 == null) {
                  class315.getLoginError(65);
                  return;
               }

               if (!this.field522.method269()) {
                  return;
               }

               if (this.field522.method266()) {
                  class387.RunException_sendStackTrace(this.field522.method268(), (Throwable)null);
                  class315.getLoginError(65);
                  this.field522 = null;
                  return;
               }

               var25 = this.field522.method270();
               if (var25.method296() != 200) {
                  class387.RunException_sendStackTrace("Response code: " + var25.method296() + "Response body: " + var25.method298(), (Throwable)null);
                  class315.getLoginError(65);
                  this.field522 = null;
                  return;
               }

               List var28 = (List)var25.method297().get("Content-Type");
               if (var28 != null && var28.contains(class435.field4703.method8319())) {
                  try {
                     JSONObject var5 = new JSONObject(var25.method298());
                     this.field528 = var5.getString("token");
                  } catch (JSONException var18) {
                     class387.RunException_sendStackTrace((String)null, var18);
                     class315.getLoginError(65);
                     this.field522 = null;
                     return;
                  }
               } else {
                  this.field528 = var25.method298();
               }

               this.field522 = null;
            }

            field523 = 0;
            class284.method5687(1);
         }

         if (loginState == 1) {
            if (class1.socketTask == null) {
               class1.socketTask = GameEngine.taskHandler.newSocketTask(UserComparator8.worldHost, ItemContainer.currentPort);
            }

            if (class1.socketTask.status == 2) {
               throw new IOException();
            }

            if (class1.socketTask.status == 1) {
               var1 = class186.method3731((Socket)class1.socketTask.result, 40000, 5000);
               packetWriter.setSocket(var1);
               class1.socketTask = null;
               class284.method5687(2);
            }
         }

         PacketBufferNode var27;
         if (loginState == 2) {
            packetWriter.clearBuffer();
            var27 = class478.method8886();
            var27.packetBuffer.writeByte(LoginPacket.field3344.id);
            packetWriter.addNode(var27);
            packetWriter.flush();
            var2.offset = 0;
            class284.method5687(3);
         }

         int var12;
         if (loginState == 3) {
            if (class28.pcmPlayer0 != null) {
               class28.pcmPlayer0.method814();
            }

            if (HorizontalAlignment.pcmPlayer1 != null) {
               HorizontalAlignment.pcmPlayer1.method814();
            }

            if (var1.isAvailable(1)) {
               var12 = var1.readUnsignedByte();
               if (class28.pcmPlayer0 != null) {
                  class28.pcmPlayer0.method814();
               }

               if (HorizontalAlignment.pcmPlayer1 != null) {
                  HorizontalAlignment.pcmPlayer1.method814();
               }

               if (var12 != 0) {
                  class315.getLoginError(var12);
                  return;
               }

               var2.offset = 0;
               class284.method5687(4);
            }
         }

         if (loginState == 4) {
            if (var2.offset < 8) {
               var12 = var1.available();
               if (var12 > 8 - var2.offset) {
                  var12 = 8 - var2.offset;
               }

               if (var12 > 0) {
                  var1.read(var2.array, var2.offset, var12);
                  var2.offset += var12;
               }
            }

            if (var2.offset == 8) {
               var2.offset = 0;
               GrandExchangeEvent.field4287 = var2.readLong();
               class284.method5687(5);
            }
         }

         int var6;
         if (loginState == 5) {
            packetWriter.packetBuffer.offset = 0;
            packetWriter.clearBuffer();
            PacketBuffer var29 = new PacketBuffer(500);
            int[] var30 = new int[]{class174.secureRandom.nextInt(), class174.secureRandom.nextInt(), class174.secureRandom.nextInt(), class174.secureRandom.nextInt()};
            var29.offset = 0;
            var29.writeByte(1);
            var29.writeInt(var30[0]);
            var29.writeInt(var30[1]);
            var29.writeInt(var30[2]);
            var29.writeInt(var30[3]);
            var29.writeLong(GrandExchangeEvent.field4287);
            if (gameState == 40) {
               var29.writeInt(Huffman.field3722[0]);
               var29.writeInt(Huffman.field3722[1]);
               var29.writeInt(Huffman.field3722[2]);
               var29.writeInt(Huffman.field3722[3]);
            } else {
               if (gameState == 50) {
                  var29.writeByte(class135.field1619.rsOrdinal());
                  var29.writeInt(ByteArrayPool.field4478);
               } else {
                  var29.writeByte(field526.rsOrdinal());
                  switch (field526.field1620) {
                     case 0:
                        var29.offset += 4;
                        break;
                     case 1:
                     case 3:
                        var29.writeMedium(class204.field2330);
                        ++var29.offset;
                        break;
                     case 2:
                        var29.writeInt(class20.clientPreferences.method2474(Login.Login_username));
                  }
               }

               if (field527.method9347()) {
                  var29.writeByte(class493.field5044.rsOrdinal());
                  var29.writeStringCp1252NullTerminated(this.field528);
               } else {
                  var29.writeByte(class493.field5048.rsOrdinal());
                  var29.writeStringCp1252NullTerminated(Login.Login_password);
               }
            }

            var29.encryptRsa(class70.field885, class70.field887);
            Huffman.field3722 = var30;
            PacketBufferNode var33 = class478.method8886();
            var33.packetBuffer.offset = 0;
            if (gameState == 40) {
               var33.packetBuffer.writeByte(LoginPacket.field3341.id);
            } else {
               var33.packetBuffer.writeByte(LoginPacket.field3342.id);
            }

            var33.packetBuffer.writeShort(0);
            var6 = var33.packetBuffer.offset;
            var33.packetBuffer.writeInt(213);
            var33.packetBuffer.writeInt(1);
            var33.packetBuffer.writeByte(clientType);
            var33.packetBuffer.writeByte(field495);
            byte var7 = 0;
            var33.packetBuffer.writeByte(var7);
            var33.packetBuffer.writeBytes(var29.array, 0, var29.offset);
            int var8 = var33.packetBuffer.offset;
            var33.packetBuffer.writeStringCp1252NullTerminated(Login.Login_username);
            var33.packetBuffer.writeByte((isResizable ? 1 : 0) << 1 | (isLowDetail ? 1 : 0));
            var33.packetBuffer.writeShort(GameEngine.canvasWidth);
            var33.packetBuffer.writeShort(class262.canvasHeight);
            class383.method7541(var33.packetBuffer);
            var33.packetBuffer.writeStringCp1252NullTerminated(class108.field1403);
            var33.packetBuffer.writeInt(TriBool.field4600);
            Buffer var9 = new Buffer(UserComparator10.platformInfo.size());
            UserComparator10.platformInfo.write(var9);
            var33.packetBuffer.writeBytes(var9.array, 0, var9.array.length);
            var33.packetBuffer.writeByte(clientType);
            var33.packetBuffer.writeInt(0);
            var33.packetBuffer.writeIntME(DevicePcmPlayerProvider.field117.hash);
            var33.packetBuffer.writeIntME(GrandExchangeOfferUnitPriceComparator.archive18.hash);
            var33.packetBuffer.writeIntIME(GrandExchangeOfferTotalQuantityComparator.archive9.hash);
            var33.packetBuffer.writeIntLE(class452.archive8.hash);
            var33.packetBuffer.writeIntIME(class126.archive15.hash);
            var33.packetBuffer.writeIntLE(NetFileRequest.archive10.hash);
            var33.packetBuffer.writeInt(class399.archive6.hash);
            var33.packetBuffer.writeIntLE(class85.archive2.hash);
            var33.packetBuffer.writeIntLE(class85.archive4.hash);
            var33.packetBuffer.writeIntIME(class28.archive19.hash);
            var33.packetBuffer.writeIntLE(class230.archive14.hash);
            var33.packetBuffer.writeIntME(class128.archive13.hash);
            var33.packetBuffer.writeIntME(WorldMapLabelSize.field2868.hash);
            var33.packetBuffer.writeIntLE(FloorUnderlayDefinition.archive11.hash);
            var33.packetBuffer.writeIntIME(class168.archive17.hash);
            var33.packetBuffer.writeIntLE(class195.field2101.hash);
            var33.packetBuffer.writeIntLE(GameBuild.archive7.hash);
            var33.packetBuffer.writeIntME(class205.archive20.hash);
            var33.packetBuffer.writeIntME(0);
            var33.packetBuffer.writeIntIME(class426.field4687.hash);
            var33.packetBuffer.writeIntME(class126.archive12.hash);
            var33.packetBuffer.xteaEncrypt(var30, var8, var33.packetBuffer.offset);
            var33.packetBuffer.writeLengthShort(var33.packetBuffer.offset - var6);
            packetWriter.addNode(var33);
            packetWriter.flush();
            packetWriter.isaacCipher = new IsaacCipher(var30);
            int[] var10 = new int[4];

            for(int var11 = 0; var11 < 4; ++var11) {
               var10[var11] = var30[var11] + 50;
            }

            var2.newIsaacCipher(var10);
            class284.method5687(6);
         }

         int var13;
         if (loginState == 6 && var1.available() > 0) {
            var12 = var1.readUnsignedByte();
            if (var12 == 61) {
               var13 = var1.available();
               WorldMapSectionType.field2983 = var13 == 1 && var1.readUnsignedByte() == 1;
               class284.method5687(5);
            }

            if (var12 == 21 && gameState == 20) {
               class284.method5687(12);
            } else if (var12 == 2) {
               class284.method5687(14);
            } else if (var12 == 15 && gameState == 40) {
               packetWriter.serverPacketLength = -1;
               class284.method5687(19);
            } else if (var12 == 64) {
               class284.method5687(10);
            } else if (var12 == 23 && field524 < 1) {
               ++field524;
               class284.method5687(0);
            } else if (var12 == 29) {
               class284.method5687(17);
            } else {
               if (var12 != 69) {
                  class315.getLoginError(var12);
                  return;
               }

               class284.method5687(7);
            }
         }

         if (loginState == 7 && var1.available() >= 2) {
            var1.read(var2.array, 0, 2);
            var2.offset = 0;
            class13.field71 = var2.readUnsignedShort();
            class284.method5687(8);
         }

         if (loginState == 8 && var1.available() >= class13.field71) {
            var2.offset = 0;
            var1.read(var2.array, var2.offset, class13.field71);
            class6[] var31 = new class6[]{class6.field17};
            class6 var32 = var31[var2.readUnsignedByte()];

            try {
               class3 var35 = UserComparator4.method2883(var32);
               this.field553 = new class7(var2, var35);
               class284.method5687(9);
            } catch (Exception var17) {
               class315.getLoginError(22);
               return;
            }
         }

         if (loginState == 9 && this.field553.method58()) {
            this.field541 = this.field553.method50();
            this.field553.method49();
            this.field553 = null;
            if (this.field541 == null) {
               class315.getLoginError(22);
               return;
            }

            packetWriter.clearBuffer();
            var27 = class478.method8886();
            var27.packetBuffer.writeByte(LoginPacket.field3338.id);
            var27.packetBuffer.writeShort(this.field541.offset);
            var27.packetBuffer.writeBuffer(this.field541);
            packetWriter.addNode(var27);
            packetWriter.flush();
            this.field541 = null;
            class284.method5687(6);
         }

         if (loginState == 10 && var1.available() > 0) {
            DevicePcmPlayerProvider.field118 = var1.readUnsignedByte();
            class284.method5687(11);
         }

         if (loginState == 11 && var1.available() >= DevicePcmPlayerProvider.field118) {
            var1.read(var2.array, 0, DevicePcmPlayerProvider.field118);
            var2.offset = 0;
            class284.method5687(6);
         }

         if (loginState == 12 && var1.available() > 0) {
            field525 = (var1.readUnsignedByte() + 3) * 60;
            class284.method5687(13);
         }

         if (loginState == 13) {
            field523 = 0;
            class205.setLoginResponseString("You have only just left another world.", "Your profile will be transferred in:", field525 / 60 + " seconds.");
            if (--field525 <= 0) {
               class284.method5687(0);
            }

         } else {
            if (loginState == 14 && var1.available() >= 1) {
               class7.field27 = var1.readUnsignedByte();
               class284.method5687(15);
            }

            if (loginState == 15 && var1.available() >= class7.field27) {
               boolean var42 = var1.readUnsignedByte() == 1;
               var1.read(var2.array, 0, 4);
               var2.offset = 0;
               boolean var41 = false;
               if (var42) {
                  var13 = var2.readByteIsaac() << 24;
                  var13 |= var2.readByteIsaac() << 16;
                  var13 |= var2.readByteIsaac() << 8;
                  var13 |= var2.readByteIsaac();
                  class20.clientPreferences.method2488(Login.Login_username, var13);
               }

               if (Login_isUsernameRemembered) {
                  class20.clientPreferences.method2466(Login.Login_username);
               } else {
                  class20.clientPreferences.method2466((String)null);
               }

               class100.savePreferences();
               staffModLevel = var1.readUnsignedByte();
               playerMod = var1.readUnsignedByte() == 1;
               localPlayerIndex = var1.readUnsignedByte();
               localPlayerIndex <<= 8;
               localPlayerIndex += var1.readUnsignedByte();
               field612 = var1.readUnsignedByte();
               var1.read(var2.array, 0, 8);
               var2.offset = 0;
               this.field543 = var2.readLong();
               if (class7.field27 >= 29) {
                  var1.read(var2.array, 0, 8);
                  var2.offset = 0;
                  field613 = var2.readLong();
               }

               var1.read(var2.array, 0, 1);
               var2.offset = 0;
               ServerPacket[] var38 = PacketBufferNode.ServerPacket_values();
               var6 = var2.readSmartByteShortIsaac();
               if (var6 < 0 || var6 >= var38.length) {
                  throw new IOException(var6 + " " + var2.offset);
               }

               packetWriter.serverPacket = var38[var6];
               packetWriter.serverPacketLength = packetWriter.serverPacket.length;
               var1.read(var2.array, 0, 2);
               var2.offset = 0;
               packetWriter.serverPacketLength = var2.readUnsignedShort();

               try {
                  class26.method393(ScriptFrame.client, "zap");
               } catch (Throwable var16) {
               }

               class284.method5687(16);
            }

            if (loginState != 16) {
               if (loginState == 17 && var1.available() >= 2) {
                  var2.offset = 0;
                  var1.read(var2.array, 0, 2);
                  var2.offset = 0;
                  class4.field12 = var2.readUnsignedShort();
                  class284.method5687(18);
               }

               if (loginState == 18 && var1.available() >= class4.field12) {
                  var2.offset = 0;
                  var1.read(var2.array, 0, class4.field12);
                  var2.offset = 0;
                  String var39 = var2.readStringCp1252NullTerminated();
                  String var36 = var2.readStringCp1252NullTerminated();
                  String var40 = var2.readStringCp1252NullTerminated();
                  class205.setLoginResponseString(var39, var36, var40);
                  class138.updateGameState(10);
                  if (field527.method9347()) {
                     class129.method3124(9);
                  }
               }

               if (loginState == 19) {
                  if (packetWriter.serverPacketLength == -1) {
                     if (var1.available() < 2) {
                        return;
                     }

                     var1.read(var2.array, 0, 2);
                     var2.offset = 0;
                     packetWriter.serverPacketLength = var2.readUnsignedShort();
                  }

                  if (var1.available() >= packetWriter.serverPacketLength) {
                     var1.read(var2.array, 0, packetWriter.serverPacketLength);
                     var2.offset = 0;
                     var12 = packetWriter.serverPacketLength;
                     timer.method7606();
                     class121.method2993();
                     class422.updatePlayer(var2);
                     if (var12 != var2.offset) {
                        throw new RuntimeException();
                     }
                  }
               } else {
                  ++field523;
                  if (field523 > 2000) {
                     if (field524 < 1) {
                        if (FriendsChat.worldPort == ItemContainer.currentPort) {
                           ItemContainer.currentPort = class127.js5Port;
                        } else {
                           ItemContainer.currentPort = FriendsChat.worldPort;
                        }

                        ++field524;
                        class284.method5687(0);
                     } else {
                        class315.getLoginError(-3);
                     }
                  }
               }
            } else {
               if (var1.available() >= packetWriter.serverPacketLength) {
                  var2.offset = 0;
                  var1.read(var2.array, 0, packetWriter.serverPacketLength);
                  timer.method7604();
                  mouseLastLastPressedTimeMillis = 1L;
                  UserComparator6.mouseRecorder.index = 0;
                  AbstractByteArrayCopier.hasFocus = true;
                  hadFocus = true;
                  field726 = -1L;
                  class36.reflectionChecks = new IterableNodeDeque();
                  packetWriter.clearBuffer();
                  packetWriter.packetBuffer.offset = 0;
                  packetWriter.serverPacket = null;
                  packetWriter.field1391 = null;
                  packetWriter.field1392 = null;
                  packetWriter.field1386 = null;
                  packetWriter.serverPacketLength = 0;
                  packetWriter.field1389 = 0;
                  rebootTimer = 0;
                  logoutTimer = 0;
                  hintArrowType = 0;
                  menuOptionsCount = 0;
                  isMenuOpen = false;
                  MouseHandler.MouseHandler_idleCycles = 0;
                  class162.method3456();
                  isItemSelected = 0;
                  isSpellSelected = false;
                  soundEffectCount = 0;
                  camAngleY = 0;
                  oculusOrbState = 0;
                  class132.field1585 = null;
                  minimapState = 0;
                  field729 = -1;
                  destinationX = 0;
                  destinationY = 0;
                  playerAttackOption = AttackOption.AttackOption_hidden;
                  npcAttackOption = AttackOption.AttackOption_hidden;
                  npcCount = 0;
                  Players.Players_count = 0;

                  for(var12 = 0; var12 < 2048; ++var12) {
                     Players.field1333[var12] = null;
                     Players.field1332[var12] = class210.field2389;
                  }

                  for(var12 = 0; var12 < 2048; ++var12) {
                     players[var12] = null;
                  }

                  for(var12 = 0; var12 < 65536; ++var12) {
                     npcs[var12] = null;
                  }

                  combatTargetPlayerIndex = -1;
                  projectiles.clear();
                  graphicsObjects.clear();

                  for(var12 = 0; var12 < 4; ++var12) {
                     for(var13 = 0; var13 < 104; ++var13) {
                        for(int var15 = 0; var15 < 104; ++var15) {
                           groundItems[var12][var13][var15] = null;
                        }
                     }
                  }

                  pendingSpawns = new NodeDeque();
                  World.friendSystem.clear();

                  for(var12 = 0; var12 < VarpDefinition.field1908; ++var12) {
                     VarpDefinition var34 = GraphicsDefaults.VarpDefinition_get(var12);
                     if (var34 != null) {
                        Varps.Varps_temp[var12] = 0;
                        Varps.Varps_main[var12] = 0;
                     }
                  }

                  class373.varcs.clearTransient();
                  followerIndex = -1;
                  if (rootInterface != -1) {
                     var12 = rootInterface;
                     if (var12 != -1 && class264.Widget_loadedInterfaces[var12]) {
                        UserComparator3.Widget_archive.clearFilesGroup(var12);
                        if (VerticalAlignment.Widget_interfaceComponents[var12] != null) {
                           for(var13 = 0; var13 < VerticalAlignment.Widget_interfaceComponents[var12].length; ++var13) {
                              if (VerticalAlignment.Widget_interfaceComponents[var12][var13] != null) {
                                 VerticalAlignment.Widget_interfaceComponents[var12][var13] = null;
                              }
                           }

                           VerticalAlignment.Widget_interfaceComponents[var12] = null;
                           class264.Widget_loadedInterfaces[var12] = false;
                        }
                     }
                  }

                  for(InterfaceParent var37 = (InterfaceParent)interfaceParents.first(); var37 != null; var37 = (InterfaceParent)interfaceParents.next()) {
                     class357.closeInterface(var37, true);
                  }

                  rootInterface = -1;
                  interfaceParents = new NodeHashTable(8);
                  meslayerContinueWidget = null;
                  menuOptionsCount = 0;
                  isMenuOpen = false;
                  playerAppearance.method6038((int[])null, (int[])null, new int[]{0, 0, 0, 0, 0}, 0, -1);

                  for(var12 = 0; var12 < 8; ++var12) {
                     playerMenuActions[var12] = null;
                     playerOptionsPriorities[var12] = false;
                  }

                  ItemContainer.itemContainers = new NodeHashTable(32);
                  isLoading = true;

                  for(var12 = 0; var12 < 100; ++var12) {
                     field705[var12] = true;
                  }

                  class1.method11();
                  UserComparator5.friendsChat = null;
                  ItemComposition.guestClanSettings = null;
                  Arrays.fill(currentClanSettings, (Object)null);
                  MouseHandler.guestClanChannel = null;
                  Arrays.fill(currentClanChannels, (Object)null);

                  for(var12 = 0; var12 < 8; ++var12) {
                     grandExchangeOffers[var12] = new GrandExchangeOffer();
                  }

                  class375.grandExchangeEvents = null;
                  class422.updatePlayer(var2);
                  class28.field164 = -1;
                  class127.loadRegions(false, var2);
                  packetWriter.serverPacket = null;
               }

            }
         }
      } catch (IOException var24) {
         if (field524 < 1) {
            if (FriendsChat.worldPort == ItemContainer.currentPort) {
               ItemContainer.currentPort = class127.js5Port;
            } else {
               ItemContainer.currentPort = FriendsChat.worldPort;
            }

            ++field524;
            class284.method5687(0);
         } else {
            class315.getLoginError(-2);
         }
      }
   }

   @ObfuscatedName("hq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-67"
   )
   @Export("doCycleLoggedIn")
   final void doCycleLoggedIn() {
      if (rebootTimer > 1) {
         --rebootTimer;
      }

      if (logoutTimer > 0) {
         --logoutTimer;
      }

      if (hadNetworkError) {
         hadNetworkError = false;
         class349.method6839();
      } else {
         if (!isMenuOpen) {
            class156.addCancelMenuEntry();
         }

         int var1;
         for(var1 = 0; var1 < 100 && this.method1349(packetWriter); ++var1) {
         }

         if (gameState == 30) {
            while(true) {
               ReflectionCheck var2 = (ReflectionCheck)class36.reflectionChecks.last();
               boolean var30;
               if (var2 == null) {
                  var30 = false;
               } else {
                  var30 = true;
               }

               int var3;
               PacketBufferNode var31;
               if (!var30) {
                  PacketBufferNode var14;
                  int var15;
                  if (timer.field4483) {
                     var14 = class330.getPacketBufferNode(ClientPacket.LOGIN_TIMINGS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     var15 = var14.packetBuffer.offset;
                     timer.write(var14.packetBuffer);
                     var14.packetBuffer.writeLengthByte(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                     timer.method7605();
                  }

                  int var4;
                  int var5;
                  int var6;
                  int var7;
                  int var8;
                  int var9;
                  int var10;
                  int var11;
                  int var12;
                  PacketBuffer var10000;
                  synchronized(UserComparator6.mouseRecorder.lock) {
                     if (!field603) {
                        UserComparator6.mouseRecorder.index = 0;
                     } else if (MouseHandler.MouseHandler_lastButton != 0 || UserComparator6.mouseRecorder.index >= 40) {
                        var31 = null;
                        var3 = 0;
                        var4 = 0;
                        var5 = 0;
                        var6 = 0;

                        for(var7 = 0; var7 < UserComparator6.mouseRecorder.index && (var31 == null || var31.packetBuffer.offset - var3 < 246); ++var7) {
                           var4 = var7;
                           var8 = UserComparator6.mouseRecorder.ys[var7];
                           if (var8 < -1) {
                              var8 = -1;
                           } else if (var8 > 65534) {
                              var8 = 65534;
                           }

                           var9 = UserComparator6.mouseRecorder.xs[var7];
                           if (var9 < -1) {
                              var9 = -1;
                           } else if (var9 > 65534) {
                              var9 = 65534;
                           }

                           if (var9 != field502 || var8 != field503) {
                              if (var31 == null) {
                                 var31 = class330.getPacketBufferNode(ClientPacket.field3193, packetWriter.isaacCipher);
                                 var31.packetBuffer.writeByte(0);
                                 var3 = var31.packetBuffer.offset;
                                 var10000 = var31.packetBuffer;
                                 var10000.offset += 2;
                                 var5 = 0;
                                 var6 = 0;
                              }

                              if (-1L != field604) {
                                 var10 = var9 - field502;
                                 var11 = var8 - field503;
                                 var12 = (int)((UserComparator6.mouseRecorder.millis[var7] - field604) / 20L);
                                 var5 = (int)((long)var5 + (UserComparator6.mouseRecorder.millis[var7] - field604) % 20L);
                              } else {
                                 var10 = var9;
                                 var11 = var8;
                                 var12 = Integer.MAX_VALUE;
                              }

                              field502 = var9;
                              field503 = var8;
                              if (var12 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                 var10 += 32;
                                 var11 += 32;
                                 var31.packetBuffer.writeShort((var12 << 12) + var11 + (var10 << 6));
                              } else if (var12 < 32 && var10 >= -128 && var10 <= 127 && var11 >= -128 && var11 <= 127) {
                                 var10 += 128;
                                 var11 += 128;
                                 var31.packetBuffer.writeByte(var12 + 128);
                                 var31.packetBuffer.writeShort(var11 + (var10 << 8));
                              } else if (var12 < 32) {
                                 var31.packetBuffer.writeByte(var12 + 192);
                                 if (var9 != -1 && var8 != -1) {
                                    var31.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var31.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              } else {
                                 var31.packetBuffer.writeShort((var12 & 8191) + '\ue000');
                                 if (var9 != -1 && var8 != -1) {
                                    var31.packetBuffer.writeInt(var9 | var8 << 16);
                                 } else {
                                    var31.packetBuffer.writeInt(Integer.MIN_VALUE);
                                 }
                              }

                              ++var6;
                              field604 = UserComparator6.mouseRecorder.millis[var7];
                           }
                        }

                        if (var31 != null) {
                           var31.packetBuffer.writeLengthByte(var31.packetBuffer.offset - var3);
                           var7 = var31.packetBuffer.offset;
                           var31.packetBuffer.offset = var3;
                           var31.packetBuffer.writeByte(var5 / var6);
                           var31.packetBuffer.writeByte(var5 % var6);
                           var31.packetBuffer.offset = var7;
                           packetWriter.addNode(var31);
                        }

                        if (var4 >= UserComparator6.mouseRecorder.index) {
                           UserComparator6.mouseRecorder.index = 0;
                        } else {
                           MouseRecorder var49 = UserComparator6.mouseRecorder;
                           var49.index -= var4;
                           System.arraycopy(UserComparator6.mouseRecorder.xs, var4, UserComparator6.mouseRecorder.xs, 0, UserComparator6.mouseRecorder.index);
                           System.arraycopy(UserComparator6.mouseRecorder.ys, var4, UserComparator6.mouseRecorder.ys, 0, UserComparator6.mouseRecorder.index);
                           System.arraycopy(UserComparator6.mouseRecorder.millis, var4, UserComparator6.mouseRecorder.millis, 0, UserComparator6.mouseRecorder.index);
                        }
                     }
                  }

                  PacketBufferNode var18;
                  if (MouseHandler.MouseHandler_lastButton == 1 || !class473.mouseCam && MouseHandler.MouseHandler_lastButton == 4 || MouseHandler.MouseHandler_lastButton == 2) {
                     long var16 = MouseHandler.MouseHandler_lastPressedTimeMillis - mouseLastLastPressedTimeMillis * -1L;
                     if (var16 > 32767L) {
                        var16 = 32767L;
                     }

                     mouseLastLastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillis * -1L;
                     var3 = MouseHandler.MouseHandler_lastPressedY;
                     if (var3 < 0) {
                        var3 = 0;
                     } else if (var3 > class262.canvasHeight) {
                        var3 = class262.canvasHeight;
                     }

                     var4 = MouseHandler.MouseHandler_lastPressedX;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > GameEngine.canvasWidth) {
                        var4 = GameEngine.canvasWidth;
                     }

                     var5 = (int)var16;
                     var18 = class330.getPacketBufferNode(ClientPacket.EVENT_MOUSE_CLICK, packetWriter.isaacCipher);
                     var18.packetBuffer.writeShort((MouseHandler.MouseHandler_lastButton == 2 ? 1 : 0) + (var5 << 1));
                     var18.packetBuffer.writeShort(var4);
                     var18.packetBuffer.writeShort(var3);
                     packetWriter.addNode(var18);
                  }

                  if (field721.field2363 > 0) {
                     var14 = class330.getPacketBufferNode(ClientPacket.EVENT_KEYBOARD, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShort(0);
                     var15 = var14.packetBuffer.offset;
                     long var19 = class96.method2634();

                     for(var5 = 0; var5 < field721.field2363; ++var5) {
                        long var21 = var19 - field726;
                        if (var21 > 16777215L) {
                           var21 = 16777215L;
                        }

                        field726 = var19;
                        var14.packetBuffer.method9103((int)var21);
                        var14.packetBuffer.writeByte(field721.field2349[var5]);
                     }

                     var14.packetBuffer.writeLengthShort(var14.packetBuffer.offset - var15);
                     packetWriter.addNode(var14);
                  }

                  if (field618 > 0) {
                     --field618;
                  }

                  if (field721.method4229(96) || field721.method4229(97) || field721.method4229(98) || field721.method4229(99)) {
                     field756 = true;
                  }

                  if (field756 && field618 <= 0) {
                     field618 = 20;
                     field756 = false;
                     var14 = class330.getPacketBufferNode(ClientPacket.EVENT_CAMERA_POSITION, packetWriter.isaacCipher);
                     var14.packetBuffer.writeShort(camAngleY);
                     var14.packetBuffer.writeShort(camAngleX);
                     packetWriter.addNode(var14);
                  }

                  if (AbstractByteArrayCopier.hasFocus && !hadFocus) {
                     hadFocus = true;
                     var14 = class330.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(1);
                     packetWriter.addNode(var14);
                  }

                  if (!AbstractByteArrayCopier.hasFocus && hadFocus) {
                     hadFocus = false;
                     var14 = class330.getPacketBufferNode(ClientPacket.EVENT_APPLET_FOCUS, packetWriter.isaacCipher);
                     var14.packetBuffer.writeByte(0);
                     packetWriter.addNode(var14);
                  }

                  if (class126.worldMap != null) {
                     class126.worldMap.method8471();
                  }

                  Coord.method6022();
                  WorldMapElement.method3662();
                  UserComparator8.method2896();
                  if (gameState != 30) {
                     return;
                  }

                  for(PendingSpawn var37 = (PendingSpawn)pendingSpawns.last(); var37 != null; var37 = (PendingSpawn)pendingSpawns.previous()) {
                     if (var37.hitpoints > 0) {
                        --var37.hitpoints;
                     }

                     if (var37.hitpoints == 0) {
                        if (var37.objectId < 0 || class195.method3874(var37.objectId, var37.field1123)) {
                           class81.addPendingSpawnToScene(var37.plane, var37.type, var37.x, var37.y, var37.objectId, var37.field1128, var37.field1123, var37.field1135);
                           var37.remove();
                        }
                     } else {
                        if (var37.delay > 0) {
                           --var37.delay;
                        }

                        if (var37.delay == 0 && var37.x >= 1 && var37.y >= 1 && var37.x <= 102 && var37.y <= 102 && (var37.field1127 < 0 || class195.method3874(var37.field1127, var37.field1124))) {
                           class81.addPendingSpawnToScene(var37.plane, var37.type, var37.x, var37.y, var37.field1127, var37.field1126, var37.field1124, var37.field1135);
                           var37.delay = -1;
                           if (var37.objectId == var37.field1127 && var37.objectId == -1) {
                              var37.remove();
                           } else if (var37.objectId == var37.field1127 && var37.field1128 == var37.field1126 && var37.field1124 == var37.field1123) {
                              var37.remove();
                           }
                        }
                     }
                  }

                  int var10002;
                  for(var1 = 0; var1 < soundEffectCount; ++var1) {
                     var10002 = queuedSoundEffectDelays[var1]--;
                     if (queuedSoundEffectDelays[var1] >= -10) {
                        SoundEffect var32 = soundEffects[var1];
                        if (var32 == null) {
                           var10000 = null;
                           var32 = SoundEffect.readSoundEffect(class426.field4687, soundEffectIds[var1], 0);
                           if (var32 == null) {
                              continue;
                           }

                           int[] var50 = queuedSoundEffectDelays;
                           var50[var1] += var32.calculateDelay();
                           soundEffects[var1] = var32;
                        }

                        if (queuedSoundEffectDelays[var1] < 0) {
                           if (soundLocations[var1] != 0) {
                              var4 = (soundLocations[var1] & 255) * 128;
                              var5 = soundLocations[var1] >> 16 & 255;
                              var6 = var5 * 128 + 64 - MusicPatchNode.localPlayer.x;
                              if (var6 < 0) {
                                 var6 = -var6;
                              }

                              var7 = soundLocations[var1] >> 8 & 255;
                              var8 = var7 * 128 + 64 - MusicPatchNode.localPlayer.y;
                              if (var8 < 0) {
                                 var8 = -var8;
                              }

                              var9 = var6 + var8 - 128;
                              if (var9 > var4) {
                                 queuedSoundEffectDelays[var1] = -100;
                                 continue;
                              }

                              if (var9 < 0) {
                                 var9 = 0;
                              }

                              var3 = (var4 - var9) * class20.clientPreferences.method2465() / var4;
                           } else {
                              var3 = class20.clientPreferences.method2463();
                           }

                           if (var3 > 0) {
                              RawSound var23 = var32.toRawSound().resample(WorldMapSectionType.decimator);
                              RawPcmStream var24 = RawPcmStream.createRawPcmStream(var23, 100, var3);
                              var24.setNumLoops(queuedSoundEffectLoops[var1] - 1);
                              class130.pcmStreamMixer.addSubStream(var24);
                           }

                           queuedSoundEffectDelays[var1] = -100;
                        }
                     } else {
                        --soundEffectCount;

                        for(var15 = var1; var15 < soundEffectCount; ++var15) {
                           soundEffectIds[var15] = soundEffectIds[var15 + 1];
                           soundEffects[var15] = soundEffects[var15 + 1];
                           queuedSoundEffectLoops[var15] = queuedSoundEffectLoops[var15 + 1];
                           queuedSoundEffectDelays[var15] = queuedSoundEffectDelays[var15 + 1];
                           soundLocations[var15] = soundLocations[var15 + 1];
                        }

                        --var1;
                     }
                  }

                  if (playingJingle && !class4.method18()) {
                     if (class20.clientPreferences.method2461() != 0 && currentTrackGroupId != -1) {
                        Message.method1201(class399.archive6, currentTrackGroupId, 0, class20.clientPreferences.method2461(), false);
                     }

                     playingJingle = false;
                  }

                  ++packetWriter.field1389;
                  if (packetWriter.field1389 > 750) {
                     class349.method6839();
                     return;
                  }

                  class207.method4244();
                  EnumComposition.method3744();
                  int[] var38 = Players.Players_indices;

                  for(var15 = 0; var15 < Players.Players_count; ++var15) {
                     Player var25 = players[var38[var15]];
                     if (var25 != null && var25.overheadTextCyclesRemaining > 0) {
                        --var25.overheadTextCyclesRemaining;
                        if (var25.overheadTextCyclesRemaining == 0) {
                           var25.overheadText = null;
                        }
                     }
                  }

                  for(var15 = 0; var15 < npcCount; ++var15) {
                     var3 = npcIndices[var15];
                     NPC var42 = npcs[var3];
                     if (var42 != null && var42.overheadTextCyclesRemaining > 0) {
                        --var42.overheadTextCyclesRemaining;
                        if (var42.overheadTextCyclesRemaining == 0) {
                           var42.overheadText = null;
                        }
                     }
                  }

                  ++graphicsCycle;
                  if (mouseCrossColor != 0) {
                     mouseCrossState = mouseCrossState * 400 + 400;
                     if (mouseCrossState * 20 >= 400) {
                        mouseCrossColor = 0;
                     }
                  }

                  Widget var39 = MidiPcmStream.mousedOverWidgetIf1;
                  Widget var33 = class130.field1574;
                  MidiPcmStream.mousedOverWidgetIf1 = null;
                  class130.field1574 = null;
                  draggedOnWidget = null;
                  field755 = false;
                  field672 = false;
                  field487 = 0;

                  while(field721.method4215() && field487 < 128) {
                     if (staffModLevel >= 2 && field721.method4229(82) && field721.field2362 == 66) {
                        StringBuilder var43 = new StringBuilder();

                        Message var40;
                        for(Iterator var45 = Messages.Messages_hashTable.iterator(); var45.hasNext(); var43.append(var40.text).append('\n')) {
                           var40 = (Message)var45.next();
                           if (var40.sender != null && !var40.sender.isEmpty()) {
                              var43.append(var40.sender).append(':');
                           }
                        }

                        String var48 = var43.toString();
                        ScriptFrame.client.method555(var48);
                     } else if (oculusOrbState != 1 || field721.field2361 <= 0) {
                        field556[field487] = field721.field2362;
                        field724[field487] = field721.field2361;
                        ++field487;
                     }
                  }

                  boolean var34 = staffModLevel >= 2;
                  PacketBufferNode var26;
                  if (var34 && field721.method4229(82) && field721.method4229(81) && mouseWheelRotation != 0) {
                     var4 = MusicPatchNode.localPlayer.plane - mouseWheelRotation;
                     if (var4 < 0) {
                        var4 = 0;
                     } else if (var4 > 3) {
                        var4 = 3;
                     }

                     if (var4 != MusicPatchNode.localPlayer.plane) {
                        var5 = MusicPatchNode.localPlayer.pathX[0] + WorldMapData_0.baseX * 64;
                        var6 = MusicPatchNode.localPlayer.pathY[0] + GameObject.baseY * 64;
                        var26 = class330.getPacketBufferNode(ClientPacket.field3179, packetWriter.isaacCipher);
                        var26.packetBuffer.writeIntIME(0);
                        var26.packetBuffer.writeShortAdd(var5);
                        var26.packetBuffer.writeByteAdd(var4);
                        var26.packetBuffer.writeShortAddLE(var6);
                        packetWriter.addNode(var26);
                     }

                     mouseWheelRotation = 0;
                  }

                  if (MouseHandler.MouseHandler_lastButton == 1) {
                     field722.method4181();
                  }

                  if (rootInterface != -1) {
                     ReflectionCheck.updateRootInterface(rootInterface, 0, 0, GameEngine.canvasWidth, class262.canvasHeight, 0, 0);
                  }

                  ++cycleCntr;

                  while(true) {
                     Widget var41;
                     ScriptEvent var44;
                     Widget var46;
                     do {
                        var44 = (ScriptEvent)field699.removeLast();
                        if (var44 == null) {
                           while(true) {
                              do {
                                 var44 = (ScriptEvent)field700.removeLast();
                                 if (var44 == null) {
                                    while(true) {
                                       do {
                                          var44 = (ScriptEvent)scriptEvents.removeLast();
                                          if (var44 == null) {
                                             while(true) {
                                                class206 var47 = (class206)field701.removeLast();
                                                if (var47 == null) {
                                                   this.menu();
                                                   class36.method722();
                                                   if (clickedWidget != null) {
                                                      this.method1259();
                                                   }

                                                   if (Scene.shouldSendWalk()) {
                                                      var4 = Scene.Scene_selectedX;
                                                      var5 = Scene.Scene_selectedY;
                                                      var18 = class330.getPacketBufferNode(ClientPacket.MOVE_GAMECLICK, packetWriter.isaacCipher);
                                                      var18.packetBuffer.writeByte(5);
                                                      var18.packetBuffer.writeShortAddLE(GameObject.baseY * 64 + var5);
                                                      var18.packetBuffer.writeShortLE(WorldMapData_0.baseX * 64 + var4);
                                                      var18.packetBuffer.writeByteSub(field721.method4229(82) ? (field721.method4229(81) ? 2 : 1) : 0);
                                                      packetWriter.addNode(var18);
                                                      Scene.method4562();
                                                      mouseCrossX = MouseHandler.MouseHandler_lastPressedX;
                                                      mouseCrossY = MouseHandler.MouseHandler_lastPressedY;
                                                      mouseCrossColor = 1;
                                                      mouseCrossState = 0;
                                                      destinationX = var4;
                                                      destinationY = var5;
                                                   }

                                                   if (var39 != MidiPcmStream.mousedOverWidgetIf1) {
                                                      if (var39 != null) {
                                                         class144.invalidateWidget(var39);
                                                      }

                                                      if (MidiPcmStream.mousedOverWidgetIf1 != null) {
                                                         class144.invalidateWidget(MidiPcmStream.mousedOverWidgetIf1);
                                                      }
                                                   }

                                                   if (var33 != class130.field1574 && field647 == field646) {
                                                      if (var33 != null) {
                                                         class144.invalidateWidget(var33);
                                                      }

                                                      if (class130.field1574 != null) {
                                                         class144.invalidateWidget(class130.field1574);
                                                      }
                                                   }

                                                   if (class130.field1574 != null) {
                                                      if (field646 < field647) {
                                                         ++field646;
                                                         if (field646 == field647) {
                                                            class144.invalidateWidget(class130.field1574);
                                                         }
                                                      }
                                                   } else if (field646 > 0) {
                                                      --field646;
                                                   }

                                                   if (oculusOrbState == 0) {
                                                      var4 = MusicPatchNode.localPlayer.x;
                                                      var5 = MusicPatchNode.localPlayer.y;
                                                      if (class33.oculusOrbFocalPointX - var4 < -500 || class33.oculusOrbFocalPointX - var4 > 500 || class144.oculusOrbFocalPointY - var5 < -500 || class144.oculusOrbFocalPointY - var5 > 500) {
                                                         class33.oculusOrbFocalPointX = var4;
                                                         class144.oculusOrbFocalPointY = var5;
                                                      }

                                                      if (var4 != class33.oculusOrbFocalPointX) {
                                                         class33.oculusOrbFocalPointX += (var4 - class33.oculusOrbFocalPointX) / 16;
                                                      }

                                                      if (var5 != class144.oculusOrbFocalPointY) {
                                                         class144.oculusOrbFocalPointY += (var5 - class144.oculusOrbFocalPointY) / 16;
                                                      }

                                                      var6 = class33.oculusOrbFocalPointX >> 7;
                                                      var7 = class144.oculusOrbFocalPointY >> 7;
                                                      var8 = class147.getTileHeight(class33.oculusOrbFocalPointX, class144.oculusOrbFocalPointY, GameEngine.Client_plane);
                                                      var9 = 0;
                                                      if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
                                                         for(var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                            for(var11 = var7 - 4; var11 <= var7 + 4; ++var11) {
                                                               var12 = GameEngine.Client_plane;
                                                               if (var12 < 3 && (Tiles.Tiles_renderFlags[1][var10][var11] & 2) == 2) {
                                                                  ++var12;
                                                               }

                                                               int var27 = var8 - Tiles.Tiles_heights[var12][var10][var11];
                                                               if (var27 > var9) {
                                                                  var9 = var27;
                                                               }
                                                            }
                                                         }
                                                      }

                                                      var10 = var9 * 192;
                                                      if (var10 > 98048) {
                                                         var10 = 98048;
                                                      }

                                                      if (var10 < 32768) {
                                                         var10 = 32768;
                                                      }

                                                      if (var10 > field588) {
                                                         field588 += (var10 - field588) / 24;
                                                      } else if (var10 < field588) {
                                                         field588 += (var10 - field588) / 80;
                                                      }

                                                      class96.field1296 = class147.getTileHeight(MusicPatchNode.localPlayer.x, MusicPatchNode.localPlayer.y, GameEngine.Client_plane) - camFollowHeight;
                                                   } else if (oculusOrbState == 1) {
                                                      class324.method6565();
                                                      short var35 = -1;
                                                      if (field721.method4229(33)) {
                                                         var35 = 0;
                                                      } else if (field721.method4229(49)) {
                                                         var35 = 1024;
                                                      }

                                                      if (field721.method4229(48)) {
                                                         if (var35 == 0) {
                                                            var35 = 1792;
                                                         } else if (var35 == 1024) {
                                                            var35 = 1280;
                                                         } else {
                                                            var35 = 1536;
                                                         }
                                                      } else if (field721.method4229(50)) {
                                                         if (var35 == 0) {
                                                            var35 = 256;
                                                         } else if (var35 == 1024) {
                                                            var35 = 768;
                                                         } else {
                                                            var35 = 512;
                                                         }
                                                      }

                                                      byte var36 = 0;
                                                      if (field721.method4229(35)) {
                                                         var36 = -1;
                                                      } else if (field721.method4229(51)) {
                                                         var36 = 1;
                                                      }

                                                      var6 = 0;
                                                      if (var35 >= 0 || var36 != 0) {
                                                         var6 = field721.method4229(81) ? oculusOrbSlowedSpeed : oculusOrbNormalSpeed;
                                                         var6 *= 16;
                                                         field728 = var35;
                                                         field530 = var36;
                                                      }

                                                      if (field777 < var6) {
                                                         field777 += var6 / 8;
                                                         if (field777 > var6) {
                                                            field777 = var6;
                                                         }
                                                      } else if (field777 > var6) {
                                                         field777 = field777 * 9 / 10;
                                                      }

                                                      if (field777 > 0) {
                                                         var7 = field777 / 16;
                                                         if (field728 >= 0) {
                                                            var4 = field728 - class125.cameraYaw & 2047;
                                                            var8 = Rasterizer3D.Rasterizer3D_sine[var4];
                                                            var9 = Rasterizer3D.Rasterizer3D_cosine[var4];
                                                            class33.oculusOrbFocalPointX += var7 * var8 / 65536;
                                                            class144.oculusOrbFocalPointY += var9 * var7 / 65536;
                                                         }

                                                         if (field530 != 0) {
                                                            class96.field1296 += var7 * field530;
                                                            if (class96.field1296 > 0) {
                                                               class96.field1296 = 0;
                                                            }
                                                         }
                                                      } else {
                                                         field728 = -1;
                                                         field530 = -1;
                                                      }

                                                      if (field721.method4229(13)) {
                                                         Canvas.method332();
                                                      }
                                                   }

                                                   if (MouseHandler.MouseHandler_currentButton == 4 && class473.mouseCam) {
                                                      var4 = MouseHandler.MouseHandler_y - mouseCamClickedY;
                                                      camAngleDX = var4 * 2;
                                                      mouseCamClickedY = var4 != -1 && var4 != 1 ? (mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
                                                      var5 = field579 - MouseHandler.MouseHandler_x;
                                                      camAngleDY = var5 * 2;
                                                      field579 = var5 != -1 && var5 != 1 ? (field579 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
                                                   } else {
                                                      if (field721.method4229(96)) {
                                                         camAngleDY += (-24 - camAngleDY) / 2;
                                                      } else if (field721.method4229(97)) {
                                                         camAngleDY += (24 - camAngleDY) / 2;
                                                      } else {
                                                         camAngleDY /= 2;
                                                      }

                                                      if (field721.method4229(98)) {
                                                         camAngleDX += (12 - camAngleDX) / 2;
                                                      } else if (field721.method4229(99)) {
                                                         camAngleDX += (-12 - camAngleDX) / 2;
                                                      } else {
                                                         camAngleDX /= 2;
                                                      }

                                                      mouseCamClickedY = MouseHandler.MouseHandler_y;
                                                      field579 = MouseHandler.MouseHandler_x;
                                                   }

                                                   camAngleY = camAngleDY / 2 + camAngleY & 2047;
                                                   camAngleX += camAngleDX / 2;
                                                   if (camAngleX < 128) {
                                                      camAngleX = 128;
                                                   }

                                                   if (camAngleX > 383) {
                                                      camAngleX = 383;
                                                   }

                                                   if (field731) {
                                                      class1.method12();
                                                   } else if (isCameraLocked) {
                                                      if (!field673) {
                                                         var4 = PlayerCompositionColorTextureOverride.field1902 * 128 + 64;
                                                         var5 = class123.field1499 * 128 + 64;
                                                         var6 = class147.getTileHeight(var4, var5, GameEngine.Client_plane) - class16.field90;
                                                         class133.method3165(var4, var6, var5);
                                                      } else if (field667 != null) {
                                                         class36.cameraX = field667.vmethod8438();
                                                         class297.cameraZ = field667.vmethod8433();
                                                         if (field748) {
                                                            class174.cameraY = field667.vmethod8434();
                                                         } else {
                                                            class174.cameraY = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - field667.vmethod8434();
                                                         }

                                                         field667.method8441();
                                                      }

                                                      if (!field747) {
                                                         var4 = FontName.field4884 * 128 + 64;
                                                         var5 = MilliClock.field1871 * 128 + 64;
                                                         var6 = class147.getTileHeight(var4, var5, GameEngine.Client_plane) - ScriptFrame.field469;
                                                         var7 = var4 - class36.cameraX;
                                                         var8 = var6 - class174.cameraY;
                                                         var9 = var5 - class297.cameraZ;
                                                         var10 = (int)Math.sqrt((double)(var7 * var7 + var9 * var9));
                                                         var11 = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531) & 2047;
                                                         var12 = (int)(Math.atan2((double)var7, (double)var9) * -325.9490051269531) & 2047;
                                                         GraphicsObject.method2026(var11, var12);
                                                      } else {
                                                         if (field737 != null) {
                                                            WorldMapSectionType.cameraPitch = field737.method8427();
                                                            WorldMapSectionType.cameraPitch = Math.min(Math.max(WorldMapSectionType.cameraPitch, 128), 383);
                                                            field737.method8441();
                                                         }

                                                         if (field750 != null) {
                                                            class125.cameraYaw = field750.method8427() & 2047;
                                                            field750.method8441();
                                                         }
                                                      }
                                                   }

                                                   for(var4 = 0; var4 < 5; ++var4) {
                                                      var10002 = field584[var4]++;
                                                   }

                                                   class373.varcs.tryWrite();
                                                   var4 = SecureRandomFuture.method2128();
                                                   var5 = GameEngine.keyHandler.method354();
                                                   if (var4 > 15000 && var5 > 15000) {
                                                      logoutTimer = 250;
                                                      MouseHandler.MouseHandler_idleCycles = 14500;
                                                      var26 = class330.getPacketBufferNode(ClientPacket.EVENT_MOUSE_IDLE, packetWriter.isaacCipher);
                                                      packetWriter.addNode(var26);
                                                   }

                                                   World.friendSystem.processFriendUpdates();

                                                   for(var7 = 0; var7 < field782.size(); ++var7) {
                                                      if (class20.method304((Integer)field782.get(var7)) != 2) {
                                                         field782.remove(var7);
                                                         --var7;
                                                      }
                                                   }

                                                   ++packetWriter.pendingWrites;
                                                   if (packetWriter.pendingWrites > 50) {
                                                      var26 = class330.getPacketBufferNode(ClientPacket.NO_TIMEOUT, packetWriter.isaacCipher);
                                                      packetWriter.addNode(var26);
                                                   }

                                                   try {
                                                      packetWriter.flush();
                                                   } catch (IOException var28) {
                                                      class349.method6839();
                                                   }

                                                   return;
                                                }

                                                FriendsList.method7770(var47);
                                             }
                                          }

                                          var46 = var44.widget;
                                          if (var46.childIndex < 0) {
                                             break;
                                          }

                                          var41 = class165.getWidget(var46.parentId);
                                       } while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]);

                                       HealthBarUpdate.runScriptEvent(var44);
                                    }
                                 }

                                 var46 = var44.widget;
                                 if (var46.childIndex < 0) {
                                    break;
                                 }

                                 var41 = class165.getWidget(var46.parentId);
                              } while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]);

                              HealthBarUpdate.runScriptEvent(var44);
                           }
                        }

                        var46 = var44.widget;
                        if (var46.childIndex < 0) {
                           break;
                        }

                        var41 = class165.getWidget(var46.parentId);
                     } while(var41 == null || var41.children == null || var46.childIndex >= var41.children.length || var46 != var41.children[var46.childIndex]);

                     HealthBarUpdate.runScriptEvent(var44);
                  }
               }

               var31 = class330.getPacketBufferNode(ClientPacket.REFLECTION_CHECK_REPLY, packetWriter.isaacCipher);
               var31.packetBuffer.writeByte(0);
               var3 = var31.packetBuffer.offset;
               class432.performReflectionCheck(var31.packetBuffer);
               var31.packetBuffer.writeLengthByte(var31.packetBuffer.offset - var3);
               packetWriter.addNode(var31);
            }
         }
      }
   }

   @ObfuscatedName("ip")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1447416501"
   )
   @Export("resizeJS")
   void resizeJS() {
      int var1 = GameEngine.canvasWidth;
      int var2 = class262.canvasHeight;
      if (super.contentWidth < var1) {
         var1 = super.contentWidth;
      }

      if (super.contentHeight < var2) {
         var2 = super.contentHeight;
      }

      if (class20.clientPreferences != null) {
         try {
            class26.method394(ScriptFrame.client, "resize", new Object[]{GrandExchangeOfferNameComparator.getWindowedMode()});
         } catch (Throwable var4) {
         }
      }

   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1724186279"
   )
   @Export("drawLoggedIn")
   final void drawLoggedIn() {
      int var1;
      if (rootInterface != -1) {
         var1 = rootInterface;
         if (SoundSystem.loadInterface(var1)) {
            TileItem.drawModelComponents(VerticalAlignment.Widget_interfaceComponents[var1], -1);
         }
      }

      for(var1 = 0; var1 < rootWidgetCount; ++var1) {
         if (field705[var1]) {
            field706[var1] = true;
         }

         field651[var1] = field705[var1];
         field705[var1] = false;
      }

      field659 = cycle;
      viewportX = -1;
      viewportY = -1;
      if (rootInterface != -1) {
         rootWidgetCount = 0;
         class13.drawWidgets(rootInterface, 0, 0, GameEngine.canvasWidth, class262.canvasHeight, 0, 0, -1);
      }

      Rasterizer2D.Rasterizer2D_resetClip();
      if (showMouseCross) {
         if (mouseCrossColor == 1) {
            class173.crossSprites[mouseCrossState * 20 / 100].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }

         if (mouseCrossColor == 2) {
            class173.crossSprites[mouseCrossState * 20 / 100 + 4].drawTransBgAt(mouseCrossX - 8, mouseCrossY - 8);
         }
      }

      if (!isMenuOpen) {
         if (viewportX != -1) {
            class85.method2275(viewportX, viewportY);
         }
      } else {
         var1 = class192.menuX;
         int var2 = ArchiveLoader.menuY;
         int var3 = DesktopPlatformInfoProvider.menuWidth;
         int var4 = class147.menuHeight;
         int var5 = 6116423;
         Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var5);
         Rasterizer2D.Rasterizer2D_fillRectangle(var1 + 1, var2 + 1, var3 - 2, 16, 0);
         Rasterizer2D.Rasterizer2D_drawRectangle(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
         class137.fontBold12.draw("Choose Option", var1 + 3, var2 + 14, var5, -1);
         int var6 = MouseHandler.MouseHandler_x;
         int var7 = MouseHandler.MouseHandler_y;

         for(int var8 = 0; var8 < menuOptionsCount; ++var8) {
            int var9 = var2 + (menuOptionsCount - 1 - var8) * 15 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < var1 + var3 && var7 > var9 - 13 && var7 < var9 + 3) {
               var10 = 16776960;
            }

            class137.fontBold12.draw(Friend.method7814(var8), var1 + 3, var9, var10, 0);
         }

         FriendsChat.invalidateMenu(class192.menuX, ArchiveLoader.menuY, DesktopPlatformInfoProvider.menuWidth, class147.menuHeight);
      }

      if (gameDrawingMode == 3) {
         for(var1 = 0; var1 < rootWidgetCount; ++var1) {
            if (field651[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711935, 128);
            } else if (field706[var1]) {
               Rasterizer2D.Rasterizer2D_fillRectangleAlpha(rootWidgetXs[var1], rootWidgetYs[var1], rootWidgetWidths[var1], rootWidgetHeights[var1], 16711680, 128);
            }
         }
      }

      class324.method6566(GameEngine.Client_plane, MusicPatchNode.localPlayer.x, MusicPatchNode.localPlayer.y, graphicsCycle);
      graphicsCycle = 0;
   }

   @ObfuscatedName("jp")
   @ObfuscatedSignature(
      descriptor = "(Leq;II)Z",
      garbageValue = "-1339454052"
   )
   boolean method1251(PacketWriter var1, int var2) {
      if (var1.serverPacketLength == 0) {
         UserComparator5.friendsChat = null;
      } else {
         if (UserComparator5.friendsChat == null) {
            UserComparator5.friendsChat = new FriendsChat(class70.loginType, ScriptFrame.client);
         }

         UserComparator5.friendsChat.method7776(var1.packetBuffer, var2);
      }

      field690 = cycleCntr;
      GraphicsObject.ClanChat_inClanChat = true;
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("jt")
   @ObfuscatedSignature(
      descriptor = "(Leq;B)Z",
      garbageValue = "-11"
   )
   boolean method1252(PacketWriter var1) {
      if (UserComparator5.friendsChat != null) {
         UserComparator5.friendsChat.method7780(var1.packetBuffer);
      }

      field690 = cycleCntr;
      GraphicsObject.ClanChat_inClanChat = true;
      var1.serverPacket = null;
      return true;
   }

   @ObfuscatedName("ja")
   @ObfuscatedSignature(
      descriptor = "(Leq;I)Z",
      garbageValue = "-1910491091"
   )
   final boolean method1349(PacketWriter var1) {
      AbstractSocket var2 = var1.getSocket();
      PacketBuffer var3 = var1.packetBuffer;
      if (var2 == null) {
         return false;
      } else {
         int var6;
         String var31;
         try {
            int var5;
            if (var1.serverPacket == null) {
               if (var1.field1388) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 0, 1);
                  var1.field1389 = 0;
                  var1.field1388 = false;
               }

               var3.offset = 0;
               if (var3.method9021()) {
                  if (!var2.isAvailable(1)) {
                     return false;
                  }

                  var2.read(var1.packetBuffer.array, 1, 1);
                  var1.field1389 = 0;
               }

               var1.field1388 = true;
               ServerPacket[] var4 = PacketBufferNode.ServerPacket_values();
               var5 = var3.readSmartByteShortIsaac();
               if (var5 < 0 || var5 >= var4.length) {
                  throw new IOException(var5 + " " + var3.offset);
               }

               var1.serverPacket = var4[var5];
               var1.serverPacketLength = var1.serverPacket.length;
            }

            if (var1.serverPacketLength == -1) {
               if (!var2.isAvailable(1)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 1);
               var1.serverPacketLength = var3.array[0] & 255;
            }

            if (var1.serverPacketLength == -2) {
               if (!var2.isAvailable(2)) {
                  return false;
               }

               var1.getSocket().read(var3.array, 0, 2);
               var3.offset = 0;
               var1.serverPacketLength = var3.readUnsignedShort();
            }

            if (!var2.isAvailable(var1.serverPacketLength)) {
               return false;
            }

            var3.offset = 0;
            var2.read(var3.array, 0, var1.serverPacketLength);
            var1.field1389 = 0;
            timer.method7602();
            var1.field1386 = var1.field1392;
            var1.field1392 = var1.field1391;
            var1.field1391 = var1.serverPacket;
            int var20;
            if (ServerPacket.PING_STATISTICS_REQUEST == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readInt();
               var6 = NetCache.getGcDuration();
               PacketBufferNode var57 = class330.getPacketBufferNode(ClientPacket.PING_STATISTICS, packetWriter.isaacCipher);
               var57.packetBuffer.writeByteAdd(GameEngine.fps);
               var57.packetBuffer.writeByteNeg(var6);
               var57.packetBuffer.writeIntME(var20);
               var57.packetBuffer.writeIntME(var5);
               packetWriter.addNode(var57);
               var1.serverPacket = null;
               return true;
            }

            long var9;
            int var13;
            long var21;
            long var23;
            String var25;
            boolean var58;
            int var63;
            byte var65;
            if (ServerPacket.MESSAGE_GAME == var1.serverPacket) {
               var65 = var3.readByte();
               var21 = (long)var3.readUnsignedShort();
               var23 = (long)var3.readMedium();
               var9 = var23 + (var21 << 32);
               var58 = false;
               ClanChannel var59 = var65 >= 0 ? currentClanChannels[var65] : MouseHandler.guestClanChannel;
               if (var59 == null) {
                  var58 = true;
               } else {
                  for(var13 = 0; var13 < 100; ++var13) {
                     if (crossWorldMessageIds[var13] == var9) {
                        var58 = true;
                        break;
                     }
                  }
               }

               if (!var58) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var9;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var25 = SceneTilePaint.method4911(var3);
                  var63 = var65 >= 0 ? 43 : 46;
                  class136.addChatMessage(var63, "", var25, var59.name);
               }

               var1.serverPacket = null;
               return true;
            }

            int var8;
            int var26;
            if (ServerPacket.field3218 == var1.serverPacket) {
               var20 = var3.readUnsignedIntIME();
               var5 = var3.readUnsignedIntME();
               var6 = var3.readUnsignedShortAddLE();
               if (var6 == 65535) {
                  var6 = -1;
               }

               var26 = var3.readUnsignedShortAdd();
               if (var26 == 65535) {
                  var26 = -1;
               }

               for(var8 = var26; var8 <= var6; ++var8) {
                  var9 = ((long)var20 << 32) + (long)var8;
                  Node var68 = widgetFlags.get(var9);
                  if (var68 != null) {
                     var68.remove();
                  }

                  widgetFlags.put(new IntegerNode(var5), var9);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var54;
            if (ServerPacket.IF_SETPOSITION == var1.serverPacket) {
               var20 = var3.method9101();
               var5 = var3.readUnsignedIntLE();
               var6 = var3.method9219();
               var54 = class165.getWidget(var5);
               if (var20 != var54.rawX || var6 != var54.rawY || var54.xAlignment != 0 || var54.yAlignment != 0) {
                  var54.rawX = var20;
                  var54.rawY = var6;
                  var54.xAlignment = 0;
                  var54.yAlignment = 0;
                  class144.invalidateWidget(var54);
                  this.alignWidget(var54);
                  if (var54.type == 0) {
                     WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var5 >> 16], var54, false);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3308 == var1.serverPacket) {
               var20 = var3.readUnsignedByteAdd();
               var5 = var3.readUnsignedByteNeg();
               var6 = var3.readInt();
               var54 = class165.getWidget(var6);
               ChatChannel.method2156(var54, var20, var5);
               class144.invalidateWidget(var54);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               class293.forceDisconnect(var20);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3284 == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedShort();
               var6 = var3.readUnsignedIntIME();
               var54 = class165.getWidget(var6);
               var54.field3626 = var5 + (var20 << 16);
               var1.serverPacket = null;
               return true;
            }

            NPC var55;
            if (ServerPacket.NPC_SPOTANIM == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var55 = npcs[var20];
               var6 = var3.readUnsignedShort();
               var5 = var3.readInt();
               if (var55 != null) {
                  var55.updateSpotAnimation(0, var6, var5 >> 16, var5 & '\uffff');
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3272 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3208);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3329 == var1.serverPacket) {
               var1.serverPacket = null;
               return true;
            }

            NPC var70;
            if (ServerPacket.field3318 == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.readUnsignedShortAdd();
               short var64 = (short)var3.method9219();
               var26 = var3.readUnsignedByteNeg();
               var70 = npcs[var5];
               if (var70 != null) {
                  var70.method2568(var26, var20, var64);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_SPOTANIM == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               Player var56;
               if (var20 == localPlayerIndex) {
                  var56 = MusicPatchNode.localPlayer;
               } else {
                  var56 = players[var20];
               }

               var5 = var3.readUnsignedShort();
               var6 = var3.readInt();
               if (var56 != null) {
                  var56.updateSpotAnimation(0, var5, var6 >> 16, var6 & '\uffff');
               }

               var1.serverPacket = null;
               return true;
            }

            boolean var66;
            String var78;
            if (ServerPacket.field3261 == var1.serverPacket) {
               var20 = var3.readUShortSmart();
               var66 = var3.readUnsignedByte() == 1;
               var78 = "";
               boolean var81 = false;
               if (var66) {
                  var78 = var3.readStringCp1252NullTerminated();
                  if (World.friendSystem.isIgnored(new Username(var78, class70.loginType))) {
                     var81 = true;
                  }
               }

               String var73 = var3.readStringCp1252NullTerminated();
               if (!var81) {
                  UserComparator5.addGameMessage(var20, var78, var73);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var29;
            if (ServerPacket.field3331 == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedIntME();
               var29 = class165.getWidget(var20);
               class282.method5683(var29, var5);
               class144.invalidateWidget(var29);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETHIDE == var1.serverPacket) {
               var20 = var3.readInt();
               var66 = var3.readUnsignedByteSub() == 1;
               var29 = class165.getWidget(var20);
               if (var66 != var29.isHidden) {
                  var29.isHidden = var66;
                  class144.invalidateWidget(var29);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3279 == var1.serverPacket) {
               return this.method1252(var1);
            }

            if (ServerPacket.field3303 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3202);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETMODEL == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var5 = var3.readUnsignedShort();
               var29 = class165.getWidget(var20);
               if (var29.modelType != 1 || var5 != var29.modelId) {
                  var29.modelType = 1;
                  var29.modelId = var5;
                  class144.invalidateWidget(var29);
               }

               var1.serverPacket = null;
               return true;
            }

            int var10;
            int var30;
            if (ServerPacket.CAM_LOOKAT == var1.serverPacket) {
               isCameraLocked = true;
               field731 = false;
               field673 = true;
               PlayerCompositionColorTextureOverride.field1902 = var3.readUnsignedByte() * 16384;
               class123.field1499 = var3.readUnsignedByte() * 16384;
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedShort();
               field748 = var3.readBoolean();
               var6 = var3.readUnsignedByte();
               var26 = PlayerCompositionColorTextureOverride.field1902 * 128 + 64;
               var8 = class123.field1499 * 128 + 64;
               boolean var86 = false;
               boolean var62 = false;
               if (field748) {
                  var30 = class174.cameraY;
                  var10 = class147.getTileHeight(var26, var8, GameEngine.Client_plane) - var20;
               } else {
                  var30 = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - class174.cameraY;
                  var10 = var20;
               }

               field667 = new class453(class36.cameraX, class297.cameraZ, var30, var26, var8, var10, var5, var6);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3282 == var1.serverPacket) {
               return this.method1251(var1, 2);
            }

            if (ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED == var1.serverPacket) {
               FontName.field4882 = var3.readUnsignedByteNeg();
               class9.field43 = var3.readUnsignedByte();

               while(var3.offset < var1.serverPacketLength) {
                  var20 = var3.readUnsignedByte();
                  class287 var87 = Varcs.method2720()[var20];
                  EnumComposition.method3751(var87);
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var77;
            if (ServerPacket.IF_SETPLAYERHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedIntLE();
               var77 = class165.getWidget(var20);
               var77.modelType = 3;
               var77.modelId = MusicPatchNode.localPlayer.appearance.getChatHeadId();
               class144.invalidateWidget(var77);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3322 == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               if (var20 == 65535) {
                  var20 = -1;
               }

               rootInterface = var20;
               this.resizeRoot(false);
               class287.Widget_resetModelFrames(var20);
               class12.runWidgetOnLoadListener(rootInterface);

               for(var5 = 0; var5 < 100; ++var5) {
                  field705[var5] = true;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_FRIENDLIST == var1.serverPacket) {
               World.friendSystem.readUpdate(var3, var1.serverPacketLength);
               field689 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MINIMAP_TOGGLE == var1.serverPacket) {
               minimapState = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3226 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3206);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3333 == var1.serverPacket) {
               Players.field1339 = null;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3256 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3205);
               var1.serverPacket = null;
               return true;
            }

            String var49;
            if (ServerPacket.RUNCLIENTSCRIPT == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               Object[] var85 = new Object[var49.length() + 1];

               for(var6 = var49.length() - 1; var6 >= 0; --var6) {
                  if (var49.charAt(var6) == 's') {
                     var85[var6 + 1] = var3.readStringCp1252NullTerminated();
                  } else {
                     var85[var6 + 1] = new Integer(var3.readInt());
                  }
               }

               var85[0] = new Integer(var3.readInt());
               ScriptEvent var88 = new ScriptEvent();
               var88.args = var85;
               HealthBarUpdate.runScriptEvent(var88);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.PLAYER_INFO == var1.serverPacket) {
               GrandExchangeEvents.updatePlayers(var3, var1.serverPacketLength);
               class85.method2276();
               var1.serverPacket = null;
               return true;
            }

            int var15;
            int var16;
            GameObject var39;
            String var40;
            if (ServerPacket.field3266 == var1.serverPacket) {
               var65 = var3.readByte();
               var31 = var3.readStringCp1252NullTerminated();
               long var32 = (long)var3.readUnsignedShort();
               long var34 = (long)var3.readMedium();
               PlayerType var90 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var3.readUnsignedByte());
               long var37 = var34 + (var32 << 32);
               boolean var61 = false;
               var39 = null;
               ClanChannel var94 = var65 >= 0 ? currentClanChannels[var65] : MouseHandler.guestClanChannel;
               if (var94 == null) {
                  var61 = true;
               } else {
                  var15 = 0;

                  while(true) {
                     if (var15 >= 100) {
                        if (var90.isUser && World.friendSystem.isIgnored(new Username(var31, class70.loginType))) {
                           var61 = true;
                        }
                        break;
                     }

                     if (crossWorldMessageIds[var15] == var37) {
                        var61 = true;
                        break;
                     }

                     ++var15;
                  }
               }

               if (!var61) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var37;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var40 = AbstractFont.escapeBrackets(SceneTilePaint.method4911(var3));
                  var16 = var65 >= 0 ? 41 : 44;
                  if (var90.modIcon != -1) {
                     class136.addChatMessage(var16, ArchiveDiskActionHandler.method6619(var90.modIcon) + var31, var40, var94.name);
                  } else {
                     class136.addChatMessage(var16, var31, var40, var94.name);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_UID192 == var1.serverPacket) {
               var3.offset += 28;
               if (var3.checkCrc()) {
                  UserComparator4.method2868(var3, var3.offset - 28);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_NORMAL == var1.serverPacket) {
               class127.loadRegions(false, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_STOCKMARKET_SLOT == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               if (var3.readUnsignedByte() == 0) {
                  grandExchangeOffers[var20] = new GrandExchangeOffer();
                  var3.offset += 18;
               } else {
                  --var3.offset;
                  grandExchangeOffers[var20] = new GrandExchangeOffer(var3, false);
               }

               field762 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3275 == var1.serverPacket) {
               var20 = var3.readShortLE();
               var5 = var3.readUnsignedIntME();
               var29 = class165.getWidget(var5);
               if (var20 != var29.sequenceId || var20 == -1) {
                  var29.sequenceId = var20;
                  var29.modelFrame = 0;
                  var29.modelFrameCycle = 0;
                  class144.invalidateWidget(var29);
               }

               var1.serverPacket = null;
               return true;
            }

            boolean var67;
            if (ServerPacket.field3330 == var1.serverPacket) {
               var67 = var3.readUnsignedByte() == 1;
               var5 = var3.readInt();
               var29 = class165.getWidget(var5);
               SecureRandomCallable.method2223(var29, MusicPatchNode.localPlayer.appearance, var67);
               class144.invalidateWidget(var29);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETCOLOUR == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               var5 = var3.readUnsignedIntME();
               var6 = var20 >> 10 & 31;
               var26 = var20 >> 5 & 31;
               var8 = var20 & 31;
               var30 = (var26 << 11) + (var6 << 19) + (var8 << 3);
               Widget var89 = class165.getWidget(var5);
               if (var30 != var89.color) {
                  var89.color = var30;
                  class144.invalidateWidget(var89);
               }

               var1.serverPacket = null;
               return true;
            }

            int var11;
            int var95;
            if (ServerPacket.PROJECTILE_SPAWN == var1.serverPacket) {
               var15 = var3.readUnsignedShort();
               var63 = var3.readUnsignedByteNeg() * 4;
               int var18 = var3.readUnsignedByteSub();
               byte var82 = var3.readByteSub();
               var13 = var3.readUnsignedByteSub() * 4;
               var95 = var3.readUnsignedShort();
               var16 = var3.readUnsignedShortAddLE();
               var11 = var3.method9106();
               int var17 = var3.readUnsignedByte();
               var6 = var3.method9105();
               var20 = var6 >> 16;
               var5 = var6 >> 8 & 255;
               var26 = var20 + (var6 >> 4 & 7);
               var8 = var5 + (var6 & 7);
               byte var60 = var3.readByte();
               var30 = var82 + var26;
               var10 = var60 + var8;
               if (var26 >= 0 && var8 >= 0 && var26 < 104 && var8 < 104 && var30 >= 0 && var10 >= 0 && var30 < 104 && var10 < 104 && var95 != 65535) {
                  var26 = var26 * 128 + 64;
                  var8 = var8 * 128 + 64;
                  var30 = var30 * 128 + 64;
                  var10 = var10 * 128 + 64;
                  Projectile var19 = new Projectile(var95, GameEngine.Client_plane, var26, var8, class147.getTileHeight(var26, var8, GameEngine.Client_plane) - var13, var15 + cycle, var16 + cycle, var17, var18, var11, var63);
                  var19.setDestination(var30, var10, class147.getTileHeight(var30, var10, GameEngine.Client_plane) - var63, var15 + cycle);
                  projectiles.addFirst(var19);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3294 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3199);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3325 == var1.serverPacket) {
               World.friendSystem.method1832();
               field689 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            InterfaceParent var7;
            long var42;
            if (ServerPacket.field3324 == var1.serverPacket) {
               var20 = var3.offset + var1.serverPacketLength;
               var5 = var3.readUnsignedShort();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var6 = var3.readUnsignedShort();
               if (var5 != rootInterface) {
                  rootInterface = var5;
                  this.resizeRoot(false);
                  class287.Widget_resetModelFrames(rootInterface);
                  class12.runWidgetOnLoadListener(rootInterface);

                  for(var26 = 0; var26 < 100; ++var26) {
                     field705[var26] = true;
                  }
               }

               InterfaceParent var36;
               for(; var6-- > 0; var36.field1038 = true) {
                  var26 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var30 = var3.readUnsignedByte();
                  var36 = (InterfaceParent)interfaceParents.get((long)var26);
                  if (var36 != null && var8 != var36.group) {
                     class357.closeInterface(var36, true);
                     var36 = null;
                  }

                  if (var36 == null) {
                     var36 = AttackOption.method2660(var26, var8, var30);
                  }
               }

               for(var7 = (InterfaceParent)interfaceParents.first(); var7 != null; var7 = (InterfaceParent)interfaceParents.next()) {
                  if (var7.field1038) {
                     var7.field1038 = false;
                  } else {
                     class357.closeInterface(var7, true);
                  }
               }

               widgetFlags = new NodeHashTable(512);

               while(var3.offset < var20) {
                  var26 = var3.readInt();
                  var8 = var3.readUnsignedShort();
                  var30 = var3.readUnsignedShort();
                  var10 = var3.readInt();

                  for(var11 = var8; var11 <= var30; ++var11) {
                     var42 = ((long)var26 << 32) + (long)var11;
                     widgetFlags.put(new IntegerNode(var10), var42);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3288 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               var5 = var3.readUnsignedByte();
               var6 = var3.readUnsignedByte();
               var26 = var3.readUnsignedByte();
               field753[var20] = true;
               field754[var20] = var5;
               field776[var20] = var6;
               field631[var20] = var26;
               field584[var20] = 0;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_SET_SEQUENCE == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               var6 = var3.readUnsignedByteAdd();
               var5 = var3.readUnsignedShortAdd();
               if (var5 == 65535) {
                  var5 = -1;
               }

               var55 = npcs[var20];
               if (var55 != null) {
                  if (var5 == var55.sequence && var5 != -1) {
                     var8 = ItemContainer.SequenceDefinition_get(var5).field2314;
                     if (var8 == 1) {
                        var55.sequenceFrame = 0;
                        var55.sequenceFrameCycle = 0;
                        var55.sequenceDelay = var6;
                        var55.field1184 = 0;
                     } else if (var8 == 2) {
                        var55.field1184 = 0;
                     }
                  } else if (var5 == -1 || var55.sequence == -1 || ItemContainer.SequenceDefinition_get(var5).field2293 >= ItemContainer.SequenceDefinition_get(var55.sequence).field2293) {
                     var55.sequence = var5;
                     var55.sequenceFrame = 0;
                     var55.sequenceFrameCycle = 0;
                     var55.sequenceDelay = var6;
                     var55.field1184 = 0;
                     var55.field1210 = var55.pathLength;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REFLECTION_CHECKER == var1.serverPacket) {
               UserComparator3.readReflectionCheck(var3, var1.serverPacketLength);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3270 == var1.serverPacket) {
               for(var20 = 0; var20 < players.length; ++var20) {
                  if (players[var20] != null) {
                     players[var20].sequence = -1;
                  }
               }

               for(var20 = 0; var20 < npcs.length; ++var20) {
                  if (npcs[var20] != null) {
                     npcs[var20].sequence = -1;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3243 == var1.serverPacket) {
               FontName.field4882 = var3.readUnsignedByteSub();
               class9.field43 = var3.readUnsignedByteNeg();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3238 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3203);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3268 == var1.serverPacket) {
               var67 = var3.readBoolean();
               if (var67) {
                  if (class132.field1585 == null) {
                     class132.field1585 = new class354();
                  }
               } else {
                  class132.field1585 = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3319 == var1.serverPacket) {
               field692 = cycleCntr;
               var65 = var3.readByte();
               class156 var83 = new class156(var3);
               ClanChannel var84;
               if (var65 >= 0) {
                  var84 = currentClanChannels[var65];
               } else {
                  var84 = MouseHandler.guestClanChannel;
               }

               var83.method3396(var84);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_SMALL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShortAdd();
               Varps.Varps_temp[var5] = var20;
               if (Varps.Varps_main[var5] != var20) {
                  Varps.Varps_main[var5] = var20;
               }

               class7.changeGameOptions(var5);
               changedVarps[++changedVarpCount - 1 & 31] = var5;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3316 == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedByteSub();
               var29 = class165.getWidget(var20);
               class162.method3452(var29, MusicPatchNode.localPlayer.appearance.gender, var5);
               class144.invalidateWidget(var29);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_RESET == var1.serverPacket) {
               field731 = false;
               isCameraLocked = false;
               field673 = false;
               field747 = false;
               FontName.field4884 = 0;
               MilliClock.field1871 = 0;
               ScriptFrame.field469 = 0;
               field748 = false;
               Archive.field4213 = 0;
               WorldMapElement.field1937 = 0;
               class138.field1637 = 0;
               KeyHandler.field137 = 0;
               PlayerCompositionColorTextureOverride.field1902 = 0;
               class123.field1499 = 0;
               class16.field90 = 0;
               field667 = null;
               field737 = null;
               field750 = null;

               for(var20 = 0; var20 < 5; ++var20) {
                  field753[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MIDI_SONG == var1.serverPacket) {
               var20 = var3.readUnsignedShortLE();
               if (var20 == 65535) {
                  var20 = -1;
               }

               class1.playSong(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3297 == var1.serverPacket) {
               var20 = var3.readMedium();
               var5 = var3.readUnsignedShortLE();
               if (var5 == 65535) {
                  var5 = -1;
               }

               CollisionMap.method4272(var5, var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETOBJECT == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedIntLE();
               var6 = var3.readUnsignedShortAddLE();
               if (var6 == 65535) {
                  var6 = -1;
               }

               var54 = class165.getWidget(var20);
               ItemComposition var71;
               if (!var54.isIf3) {
                  if (var6 == -1) {
                     var54.modelType = 0;
                     var1.serverPacket = null;
                     return true;
                  }

                  var71 = HealthBarUpdate.ItemDefinition_get(var6);
                  var54.modelType = 4;
                  var54.modelId = var6;
                  var54.modelAngleX = var71.xan2d;
                  var54.modelAngleY = var71.yan2d;
                  var54.modelZoom = var71.zoom2d * 100 / var5;
                  class144.invalidateWidget(var54);
               } else {
                  var54.itemId = var6;
                  var54.itemQuantity = var5;
                  var71 = HealthBarUpdate.ItemDefinition_get(var6);
                  var54.modelAngleX = var71.xan2d;
                  var54.modelAngleY = var71.yan2d;
                  var54.modelAngleZ = var71.zan2d;
                  var54.modelOffsetX = var71.offsetX2d;
                  var54.modelOffsetY = var71.offsetY2d;
                  var54.modelZoom = var71.zoom2d;
                  if (var71.isStackable == 1) {
                     var54.itemQuantityMode = 1;
                  } else {
                     var54.itemQuantityMode = 2;
                  }

                  if (var54.field3625 > 0) {
                     var54.modelZoom = var54.modelZoom * 32 / var54.field3625;
                  } else if (var54.rawWidth > 0) {
                     var54.modelZoom = var54.modelZoom * 32 / var54.rawWidth;
                  }

                  class144.invalidateWidget(var54);
               }

               var1.serverPacket = null;
               return true;
            }

            boolean var41;
            if (ServerPacket.field3269 == var1.serverPacket) {
               isCameraLocked = true;
               field731 = false;
               field673 = true;
               PlayerCompositionColorTextureOverride.field1902 = var3.readUnsignedByte() * 16384;
               class123.field1499 = var3.readUnsignedByte() * 16384;
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte() * 128 + 64;
               var6 = var3.readUnsignedByte() * 128 + 64;
               var26 = var3.readUnsignedShort();
               field748 = var3.readBoolean();
               var8 = var3.readUnsignedByte();
               var30 = PlayerCompositionColorTextureOverride.field1902 * 128 + 64;
               var10 = class123.field1499 * 128 + 64;
               var58 = false;
               var41 = false;
               if (field748) {
                  var11 = class174.cameraY;
                  var95 = class147.getTileHeight(var30, var10, GameEngine.Client_plane) - var20;
               } else {
                  var11 = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - class174.cameraY;
                  var95 = var20;
               }

               field667 = new class452(class36.cameraX, class297.cameraZ, var11, var30, var10, var95, var5, var6, var26, var8);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.TRIGGER_ONDIALOG_ABORT == var1.serverPacket) {
               if (rootInterface != -1) {
                  class127.runIntfCloseListeners(rootInterface, 0);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3292 == var1.serverPacket && isCameraLocked) {
               field731 = true;
               field747 = false;
               field673 = false;

               for(var20 = 0; var20 < 5; ++var20) {
                  field753[var20] = false;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MINIMAP_FLAG_SET == var1.serverPacket) {
               destinationX = var3.readUnsignedByte();
               if (destinationX == 255) {
                  destinationX = 0;
               }

               destinationY = var3.readUnsignedByte();
               if (destinationY == 255) {
                  destinationY = 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3293 == var1.serverPacket) {
               isCameraLocked = true;
               field731 = false;
               field747 = true;
               var20 = var3.readShort();
               var5 = var3.readShort();
               var6 = class18.method290(var5 + WorldMapSectionType.cameraPitch & 2027);
               var26 = var20 + class125.cameraYaw;
               var8 = var3.readUnsignedShort();
               var30 = var3.readUnsignedByte();
               field737 = new class454(WorldMapSectionType.cameraPitch, var6, var8, var30);
               field750 = new class454(class125.cameraYaw, var26, var8, var30);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3228 == var1.serverPacket) {
               Players.field1339 = new class429(MenuAction.HitSplatDefinition_cached);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.URL_OPEN == var1.serverPacket) {
               byte[] var53 = new byte[var1.serverPacketLength];
               var3.method9003(var53, 0, var53.length);
               Buffer var80 = new Buffer(var53);
               var78 = var80.readStringCp1252NullTerminated();
               Ignored.openURL(var78, true, false);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3252 == var1.serverPacket) {
               isCameraLocked = true;
               field731 = false;
               field673 = false;
               PlayerCompositionColorTextureOverride.field1902 = var3.readUnsignedByte() * 16384;
               class123.field1499 = var3.readUnsignedByte() * 16384;
               class16.field90 = var3.readUnsignedShort();
               KeyHandler.field137 = var3.readUnsignedByte();
               class138.field1637 = var3.readUnsignedByte();
               if (class138.field1637 >= 100) {
                  class36.cameraX = PlayerCompositionColorTextureOverride.field1902 * 128 + 64;
                  class297.cameraZ = class123.field1499 * 128 + 64;
                  class174.cameraY = class147.getTileHeight(class36.cameraX, class297.cameraZ, GameEngine.Client_plane) - class16.field90;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3285 == var1.serverPacket) {
               class36.method723();
               var65 = var3.readByte();
               class142 var79 = new class142(var3);
               ClanSettings var74;
               if (var65 >= 0) {
                  var74 = currentClanSettings[var65];
               } else {
                  var74 = ItemComposition.guestClanSettings;
               }

               var79.method3225(var74);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3240 == var1.serverPacket) {
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var6 = var3.readUnsignedShort();
               class133.queueSoundEffect(var20, var5, var6);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3258 == var1.serverPacket) {
               var20 = var3.readInt();
               if (var20 != field576) {
                  field576 = var20;
                  class173.method3586();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3233 == var1.serverPacket) {
               ClientPacket.method5688();
               runEnergy = var3.readUnsignedShort();
               field565 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETSCROLLPOS == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedShortAddLE();
               var29 = class165.getWidget(var20);
               if (var29 != null && var29.type == 0) {
                  if (var5 > var29.scrollHeight - var29.height) {
                     var5 = var29.scrollHeight - var29.height;
                  }

                  if (var5 < 0) {
                     var5 = 0;
                  }

                  if (var5 != var29.scrollY) {
                     var29.scrollY = var5;
                     class144.invalidateWidget(var29);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3274 == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var5 = var3.readUnsignedIntME();
               var29 = class165.getWidget(var5);
               if (!var49.equals(var29.text)) {
                  var29.text = var49;
                  class144.invalidateWidget(var29);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3311 == var1.serverPacket) {
               class36.method723();
               var65 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var65 >= 0) {
                     currentClanSettings[var65] = null;
                  } else {
                     ItemComposition.guestClanSettings = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var65 >= 0) {
                  currentClanSettings[var65] = new ClanSettings(var3);
               } else {
                  ItemComposition.guestClanSettings = new ClanSettings(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3334 == var1.serverPacket) {
               var26 = var3.readUnsignedByte();
               var20 = var3.readUnsignedShort();
               var70 = npcs[var20];
               var6 = var3.readUnsignedShort();
               var5 = var3.readInt();
               if (var70 != null) {
                  var70.updateSpotAnimation(var26, var6, var5 >> 16, var5 & '\uffff');
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SYNC_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < Varps.Varps_main.length; ++var20) {
                  if (Varps.Varps_temp[var20] != Varps.Varps_main[var20]) {
                     Varps.Varps_main[var20] = Varps.Varps_temp[var20];
                     class7.changeGameOptions(var20);
                     changedVarps[++changedVarpCount - 1 & 31] = var20;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_FULL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var29 = class165.getWidget(var20);
               } else {
                  var29 = null;
               }

               for(; var3.offset < var1.serverPacketLength; class373.itemContainerSetItem(var5, var26, var8 - 1, var30)) {
                  var26 = var3.readUShortSmart();
                  var8 = var3.readUnsignedShort();
                  var30 = 0;
                  if (var8 != 0) {
                     var30 = var3.readUnsignedByte();
                     if (var30 == 255) {
                        var30 = var3.readInt();
                     }
                  }

                  if (var29 != null && var26 >= 0 && var26 < var29.itemIds.length) {
                     var29.itemIds[var26] = var8;
                     var29.itemQuantities[var26] = var30;
                  }
               }

               if (var29 != null) {
                  class144.invalidateWidget(var29);
               }

               ClientPacket.method5688();
               changedItemContainers[++field683 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.LOGOUT_FULL == var1.serverPacket) {
               class31.logOut();
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.field3280 == var1.serverPacket) {
               return this.method1251(var1, 1);
            }

            if (ServerPacket.field3327 == var1.serverPacket) {
               isCameraLocked = true;
               field731 = false;
               field747 = true;
               var20 = class425.method8242(var3.readShort() & 2027);
               var5 = class18.method290(var3.readShort() & 2027);
               var6 = var3.readUnsignedShort();
               var26 = var3.readUnsignedByte();
               field737 = new class454(WorldMapSectionType.cameraPitch, var5, var6, var26);
               field750 = new class454(class125.cameraYaw, var20, var6, var26);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3332 == var1.serverPacket) {
               ClientPacket.method5688();
               weight = var3.readShort();
               field565 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3255 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3204);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_ZONE_FULL_FOLLOWS == var1.serverPacket) {
               FontName.field4882 = var3.readUnsignedByte();
               class9.field43 = var3.readUnsignedByteAdd();

               for(var20 = class9.field43; var20 < class9.field43 + 8; ++var20) {
                  for(var5 = FontName.field4882; var5 < FontName.field4882 + 8; ++var5) {
                     if (groundItems[GameEngine.Client_plane][var20][var5] != null) {
                        groundItems[GameEngine.Client_plane][var20][var5] = null;
                        class121.updateItemPile(var20, var5);
                     }
                  }
               }

               for(PendingSpawn var52 = (PendingSpawn)pendingSpawns.last(); var52 != null; var52 = (PendingSpawn)pendingSpawns.previous()) {
                  if (var52.x >= class9.field43 && var52.x < class9.field43 + 8 && var52.y >= FontName.field4882 && var52.y < FontName.field4882 + 8 && var52.plane == GameEngine.Client_plane) {
                     var52.hitpoints = 0;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            Widget var28;
            if (ServerPacket.IF_MOVESUB == var1.serverPacket) {
               var20 = var3.readUnsignedIntME();
               var5 = var3.readUnsignedIntME();
               InterfaceParent var72 = (InterfaceParent)interfaceParents.get((long)var20);
               var7 = (InterfaceParent)interfaceParents.get((long)var5);
               if (var7 != null) {
                  class357.closeInterface(var7, var72 == null || var7.group != var72.group);
               }

               if (var72 != null) {
                  var72.remove();
                  interfaceParents.put(var72, (long)var5);
               }

               var28 = class165.getWidget(var20);
               if (var28 != null) {
                  class144.invalidateWidget(var28);
               }

               var28 = class165.getWidget(var5);
               if (var28 != null) {
                  class144.invalidateWidget(var28);
                  WallDecoration.revalidateWidgetScroll(VerticalAlignment.Widget_interfaceComponents[var28.id >>> 16], var28, true);
               }

               if (rootInterface != -1) {
                  class127.runIntfCloseListeners(rootInterface, 1);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.EVENT_WORLDHOP == var1.serverPacket) {
               World var51 = new World();
               var51.host = var3.readStringCp1252NullTerminated();
               var51.id = var3.readUnsignedShort();
               var5 = var3.readInt();
               var51.properties = var5;
               class138.updateGameState(45);
               var2.close();
               var2 = null;
               FloorOverlayDefinition.changeWorld(var51);
               var1.serverPacket = null;
               return false;
            }

            if (ServerPacket.NPC_INFO_SMALL_VIEWPORT_1 == var1.serverPacket) {
               class146.updateNpcs(true, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3223 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3196);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_CLEAR == var1.serverPacket) {
               var20 = var3.readInt();
               var77 = class165.getWidget(var20);

               for(var6 = 0; var6 < var77.itemIds.length; ++var6) {
                  var77.itemIds[var6] = -1;
                  var77.itemIds[var6] = 0;
               }

               class144.invalidateWidget(var77);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CAM_SETANGLE == var1.serverPacket) {
               isCameraLocked = true;
               field731 = false;
               field747 = false;
               FontName.field4884 = var3.readUnsignedByte() * 16384;
               MilliClock.field1871 = var3.readUnsignedByte() * 16384;
               ScriptFrame.field469 = var3.readUnsignedShort();
               Archive.field4213 = var3.readUnsignedByte();
               WorldMapElement.field1937 = var3.readUnsignedByte();
               if (WorldMapElement.field1937 >= 100) {
                  var20 = FontName.field4884 * 128 + 64;
                  var5 = MilliClock.field1871 * 128 + 64;
                  var6 = class147.getTileHeight(var20, var5, GameEngine.Client_plane) - ScriptFrame.field469;
                  var26 = var20 - class36.cameraX;
                  var8 = var6 - class174.cameraY;
                  var30 = var5 - class297.cameraZ;
                  var10 = (int)Math.sqrt((double)(var26 * var26 + var30 * var30));
                  WorldMapSectionType.cameraPitch = (int)(Math.atan2((double)var8, (double)var10) * 325.9490051269531) & 2047;
                  class125.cameraYaw = (int)(Math.atan2((double)var26, (double)var30) * -325.9490051269531) & 2047;
                  if (WorldMapSectionType.cameraPitch < 128) {
                     WorldMapSectionType.cameraPitch = 128;
                  }

                  if (WorldMapSectionType.cameraPitch > 383) {
                     WorldMapSectionType.cameraPitch = 383;
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3224 == var1.serverPacket) {
               ScriptFrame.method1166(var3.readStringCp1252NullTerminated());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3335 == var1.serverPacket) {
               var26 = var3.readUnsignedByte();
               var20 = var3.readUnsignedShort();
               Player var69;
               if (var20 == localPlayerIndex) {
                  var69 = MusicPatchNode.localPlayer;
               } else {
                  var69 = players[var20];
               }

               var5 = var3.readUnsignedShort();
               var6 = var3.readInt();
               if (var69 != null) {
                  var69.updateSpotAnimation(var26, var5, var6 >> 16, var6 & '\uffff');
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3253 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3200);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_STAT == var1.serverPacket) {
               ClientPacket.method5688();
               var20 = var3.readUnsignedByteSub();
               var5 = var3.readUnsignedByteSub();
               var6 = var3.readUnsignedIntLE();
               experience[var20] = var6;
               currentLevels[var20] = var5;
               levels[var20] = 1;

               for(var26 = 0; var26 < 98; ++var26) {
                  if (var6 >= Skills.Skills_experienceTable[var26]) {
                     levels[var20] = var26 + 2;
                  }
               }

               changedSkills[++changedSkillsCount - 1 & 31] = var20;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.REBUILD_REGION == var1.serverPacket) {
               class127.loadRegions(true, var1.packetBuffer);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETANGLE == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedShortAdd();
               var6 = var3.readUnsignedIntIME();
               var26 = var3.readUnsignedShort();
               var28 = class165.getWidget(var6);
               if (var5 != var28.modelAngleX || var20 != var28.modelAngleY || var26 != var28.modelZoom) {
                  var28.modelAngleX = var5;
                  var28.modelAngleY = var20;
                  var28.modelZoom = var26;
                  class144.invalidateWidget(var28);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.DYNAMICOBJECT_SPAWN == var1.serverPacket) {
               var30 = var3.readUnsignedByte();
               var10 = var30 >> 2;
               var11 = var30 & 3;
               var95 = field563[var10];
               var6 = var3.method9084();
               var20 = var6 >> 16;
               var5 = var6 >> 8 & 255;
               var26 = var20 + (var6 >> 4 & 7);
               var8 = var5 + (var6 & 7);
               var13 = var3.readUnsignedShortLE();
               if (var26 >= 0 && var8 >= 0 && var26 < 103 && var8 < 103) {
                  if (var95 == 0) {
                     BoundaryObject var93 = class31.scene.method4544(GameEngine.Client_plane, var26, var8);
                     if (var93 != null) {
                        var15 = InterfaceParent.Entity_unpackID(var93.tag);
                        if (var10 == 2) {
                           var93.renderable1 = new DynamicObject(var15, 2, var11 + 4, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable1);
                           var93.renderable2 = new DynamicObject(var15, 2, var11 + 1 & 3, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable2);
                        } else {
                           var93.renderable1 = new DynamicObject(var15, var10, var11, GameEngine.Client_plane, var26, var8, var13, false, var93.renderable1);
                        }
                     }
                  } else if (var95 == 1) {
                     WallDecoration var92 = class31.scene.method4545(GameEngine.Client_plane, var26, var8);
                     if (var92 != null) {
                        var15 = InterfaceParent.Entity_unpackID(var92.tag);
                        if (var10 != 4 && var10 != 5) {
                           if (var10 == 6) {
                              var92.renderable1 = new DynamicObject(var15, 4, var11 + 4, GameEngine.Client_plane, var26, var8, var13, false, var92.renderable1);
                           } else if (var10 == 7) {
                              var92.renderable1 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, GameEngine.Client_plane, var26, var8, var13, false, var92.renderable1);
                           } else if (var10 == 8) {
                              var92.renderable1 = new DynamicObject(var15, 4, var11 + 4, GameEngine.Client_plane, var26, var8, var13, false, var92.renderable1);
                              var92.renderable2 = new DynamicObject(var15, 4, (var11 + 2 & 3) + 4, GameEngine.Client_plane, var26, var8, var13, false, var92.renderable2);
                           }
                        } else {
                           var92.renderable1 = new DynamicObject(var15, 4, var11, GameEngine.Client_plane, var26, var8, var13, false, var92.renderable1);
                        }
                     }
                  } else if (var95 == 2) {
                     var39 = class31.scene.getGameObject(GameEngine.Client_plane, var26, var8);
                     if (var10 == 11) {
                        var10 = 10;
                     }

                     if (var39 != null) {
                        var39.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var39.tag), var10, var11, GameEngine.Client_plane, var26, var8, var13, false, var39.renderable);
                     }
                  } else if (var95 == 3) {
                     FloorDecoration var91 = class31.scene.getFloorDecoration(GameEngine.Client_plane, var26, var8);
                     if (var91 != null) {
                        var91.renderable = new DynamicObject(InterfaceParent.Entity_unpackID(var91.tag), 22, var11, GameEngine.Client_plane, var26, var8, var13, false, var91.renderable);
                     }
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3251 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3201);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3281 == var1.serverPacket) {
               var20 = var3.readUnsignedByte();
               class244.method5044(var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3276 == var1.serverPacket) {
               var67 = var3.readUnsignedByte() == 1;
               if (var67) {
                  class323.field3740 = class96.method2634() - var3.readLong();
                  class375.grandExchangeEvents = new GrandExchangeEvents(var3, true);
               } else {
                  class375.grandExchangeEvents = null;
               }

               field768 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3326 == var1.serverPacket) {
               isCameraLocked = true;
               field731 = false;
               field747 = true;
               FontName.field4884 = var3.readUnsignedByte() * 16384;
               MilliClock.field1871 = var3.readUnsignedByte() * 16384;
               ScriptFrame.field469 = var3.readUnsignedShort();
               var20 = var3.readUnsignedShort();
               var5 = var3.readUnsignedByte();
               var6 = FontName.field4884 * 128 + 64;
               var26 = MilliClock.field1871 * 128 + 64;
               var8 = class147.getTileHeight(var6, var26, GameEngine.Client_plane) - ScriptFrame.field469;
               var30 = var6 - class36.cameraX;
               var10 = var8 - class174.cameraY;
               var11 = var26 - class297.cameraZ;
               double var96 = Math.sqrt((double)(var11 * var11 + var30 * var30));
               var63 = class18.method290((int)(Math.atan2((double)var10, var96) * 325.9490051269531) & 2047);
               var15 = class425.method8242((int)(Math.atan2((double)var30, (double)var11) * -325.9490051269531) & 2047);
               field737 = new class454(WorldMapSectionType.cameraPitch, var63, var20, var5);
               field750 = new class454(class125.cameraYaw, var15, var20, var5);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SET_PRIVCHATMODE == var1.serverPacket) {
               FloorUnderlayDefinition.privateChatMode = class399.method7732(var3.readUnsignedByte());
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_IGNORELIST == var1.serverPacket) {
               World.friendSystem.ignoreList.read(var3, var1.serverPacketLength);
               Login.FriendSystem_invalidateIgnoreds();
               field689 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.NPC_INFO_LARGE_VIEWPORT_2 == var1.serverPacket) {
               class146.updateNpcs(false, var3);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3244 == var1.serverPacket) {
               if (Players.field1339 == null) {
                  Players.field1339 = new class429(MenuAction.HitSplatDefinition_cached);
               }

               class497 var50 = MenuAction.HitSplatDefinition_cached.method8285(var3);
               Players.field1339.field4697.vmethod8745(var50.field5058, var50.field5057);
               field686[++field687 - 1 & 31] = var50.field5058;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.VARP_LARGE == var1.serverPacket) {
               var65 = var3.readByteNeg();
               var5 = var3.readUnsignedShort();
               Varps.Varps_temp[var5] = var65;
               if (Varps.Varps_main[var5] != var65) {
                  Varps.Varps_main[var5] = var65;
               }

               class7.changeGameOptions(var5);
               changedVarps[++changedVarpCount - 1 & 31] = var5;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_STOP_TRANSIT == var1.serverPacket) {
               var20 = var3.readUnsignedShortAdd();
               User.method7857(var20);
               changedItemContainers[++field683 - 1 & 31] = var20 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3250 == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedIntLE();
               var29 = class165.getWidget(var5);
               if (var29.modelType != 6 || var20 != var29.modelId) {
                  var29.modelType = 6;
                  var29.modelId = var20;
                  class144.invalidateWidget(var29);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_PRIVATE == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var21 = (long)var3.readUnsignedShort();
               var23 = (long)var3.readMedium();
               PlayerType var44 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var3.readUnsignedByte());
               long var45 = var23 + (var21 << 32);
               var41 = false;

               for(var13 = 0; var13 < 100; ++var13) {
                  if (crossWorldMessageIds[var13] == var45) {
                     var41 = true;
                     break;
                  }
               }

               if (World.friendSystem.isIgnored(new Username(var49, class70.loginType))) {
                  var41 = true;
               }

               if (!var41 && field608 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var45;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var25 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(var3)));
                  if (var44.isPrivileged) {
                     var63 = 7;
                  } else {
                     var63 = 3;
                  }

                  if (var44.modIcon != -1) {
                     UserComparator5.addGameMessage(var63, ArchiveDiskActionHandler.method6619(var44.modIcon) + var49, var25);
                  } else {
                     UserComparator5.addGameMessage(var63, var49, var25);
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_SETNPCHEAD == var1.serverPacket) {
               var20 = var3.readUnsignedShortAddLE();
               var5 = var3.readUnsignedIntIME();
               var29 = class165.getWidget(var5);
               if (var29.modelType != 2 || var20 != var29.modelId) {
                  var29.modelType = 2;
                  var29.modelId = var20;
                  class144.invalidateWidget(var29);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3296 == var1.serverPacket) {
               field692 = cycleCntr;
               var65 = var3.readByte();
               if (var1.serverPacketLength == 1) {
                  if (var65 >= 0) {
                     currentClanChannels[var65] = null;
                  } else {
                     MouseHandler.guestClanChannel = null;
                  }

                  var1.serverPacket = null;
                  return true;
               }

               if (var65 >= 0) {
                  currentClanChannels[var65] = new ClanChannel(var3);
               } else {
                  MouseHandler.guestClanChannel = new ClanChannel(var3);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.RESET_CLIENT_VARCACHE == var1.serverPacket) {
               for(var20 = 0; var20 < VarpDefinition.field1908; ++var20) {
                  VarpDefinition var76 = GraphicsDefaults.VarpDefinition_get(var20);
                  if (var76 != null) {
                     Varps.Varps_temp[var20] = 0;
                     Varps.Varps_main[var20] = 0;
                  }
               }

               ClientPacket.method5688();
               changedVarpCount += 32;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.IF_CLOSESUB == var1.serverPacket) {
               var20 = var3.readInt();
               InterfaceParent var75 = (InterfaceParent)interfaceParents.get((long)var20);
               if (var75 != null) {
                  class357.closeInterface(var75, true);
               }

               if (meslayerContinueWidget != null) {
                  class144.invalidateWidget(meslayerContinueWidget);
                  meslayerContinueWidget = null;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.SET_PLAYER_OP == var1.serverPacket) {
               var20 = var3.readUnsignedByteSub();
               var31 = var3.readStringCp1252NullTerminated();
               var6 = var3.readUnsignedByteSub();
               if (var20 >= 1 && var20 <= 8) {
                  if (var31.equalsIgnoreCase("null")) {
                     var31 = null;
                  }

                  playerMenuActions[var20 - 1] = var31;
                  playerOptionsPriorities[var20 - 1] = var6 == 0;
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_PRIVATE_ECHO == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var31 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(var3)));
               UserComparator5.addGameMessage(6, var49, var31);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.MESSAGE_FRIENDS_CHAT == var1.serverPacket) {
               var49 = var3.readStringCp1252NullTerminated();
               var21 = var3.readLong();
               var23 = (long)var3.readUnsignedShort();
               var9 = (long)var3.readMedium();
               PlayerType var27 = (PlayerType)StructComposition.findEnumerated(StudioGame.PlayerType_values(), var3.readUnsignedByte());
               var42 = var9 + (var23 << 32);
               boolean var14 = false;

               for(var15 = 0; var15 < 100; ++var15) {
                  if (crossWorldMessageIds[var15] == var42) {
                     var14 = true;
                     break;
                  }
               }

               if (var27.isUser && World.friendSystem.isIgnored(new Username(var49, class70.loginType))) {
                  var14 = true;
               }

               if (!var14 && field608 == 0) {
                  crossWorldMessageIds[crossWorldMessageIdsIndex] = var42;
                  crossWorldMessageIdsIndex = (crossWorldMessageIdsIndex + 1) % 100;
                  var40 = AbstractFont.escapeBrackets(BuddyRankComparator.method2960(SceneTilePaint.method4911(var3)));
                  if (var27.modIcon != -1) {
                     class136.addChatMessage(9, ArchiveDiskActionHandler.method6619(var27.modIcon) + var49, var40, FloorUnderlayDefinition.base37DecodeLong(var21));
                  } else {
                     class136.addChatMessage(9, var49, var40, FloorUnderlayDefinition.base37DecodeLong(var21));
                  }
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.GRAPHICSOBJECT_SPAWN == var1.serverPacket) {
               var10 = var3.readUnsignedByte();
               var11 = var3.readUnsignedShortAddLE();
               var6 = var3.method9084();
               var20 = var6 >> 16;
               var5 = var6 >> 8 & 255;
               var26 = var20 + (var6 >> 4 & 7);
               var8 = var5 + (var6 & 7);
               var30 = var3.readUnsignedShort();
               if (var26 >= 0 && var8 >= 0 && var26 < 104 && var8 < 104) {
                  var26 = var26 * 128 + 64;
                  var8 = var8 * 128 + 64;
                  GraphicsObject var12 = new GraphicsObject(var30, GameEngine.Client_plane, var26, var8, class147.getTileHeight(var26, var8, GameEngine.Client_plane) - var10, var11, cycle);
                  graphicsObjects.addFirst(var12);
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.CHAT_FILTER_SETTINGS == var1.serverPacket) {
               publicChatMode = var3.readUnsignedByteSub();
               tradeChatMode = var3.readUnsignedByte();
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_REBOOT_TIMER == var1.serverPacket) {
               rebootTimer = var3.readUnsignedShortLE() * 30;
               field565 = cycleCntr;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.HINT_ARROW == var1.serverPacket) {
               hintArrowType = var3.readUnsignedByte();
               if (hintArrowType == 1) {
                  hintArrowNpcIndex = var3.readUnsignedShort();
               }

               if (hintArrowType >= 2 && hintArrowType <= 6) {
                  if (hintArrowType == 2) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 3) {
                     hintArrowSubX = 0;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 4) {
                     hintArrowSubX = 8192;
                     hintArrowSubY = 4096;
                  }

                  if (hintArrowType == 5) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 0;
                  }

                  if (hintArrowType == 6) {
                     hintArrowSubX = 4096;
                     hintArrowSubY = 8192;
                  }

                  hintArrowType = 2;
                  hintArrowX = var3.readUnsignedShort();
                  hintArrowY = var3.readUnsignedShort();
                  hintArrowHeight = var3.readUnsignedByte() * 4;
               }

               if (hintArrowType == 10) {
                  hintArrowPlayerIndex = var3.readUnsignedShort();
               }

               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3248 == var1.serverPacket) {
               var20 = var3.readUnsignedByteNeg();
               var5 = var3.readUnsignedShortLE();
               var6 = var3.readUnsignedIntIME();
               var7 = (InterfaceParent)interfaceParents.get((long)var6);
               if (var7 != null) {
                  class357.closeInterface(var7, var5 != var7.group);
               }

               AttackOption.method2660(var6, var5, var20);
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.UPDATE_INV_PARTIAL == var1.serverPacket) {
               var20 = var3.readInt();
               var5 = var3.readUnsignedShort();
               if (var20 < -70000) {
                  var5 += 32768;
               }

               if (var20 >= 0) {
                  var29 = class165.getWidget(var20);
               } else {
                  var29 = null;
               }

               if (var29 != null) {
                  for(var26 = 0; var26 < var29.itemIds.length; ++var26) {
                     var29.itemIds[var26] = 0;
                     var29.itemQuantities[var26] = 0;
                  }
               }

               WorldMapRegion.clearItemContainer(var5);
               var26 = var3.readUnsignedShort();

               for(var8 = 0; var8 < var26; ++var8) {
                  var30 = var3.readUnsignedShortLE();
                  var10 = var3.readUnsignedByteSub();
                  if (var10 == 255) {
                     var10 = var3.readUnsignedIntIME();
                  }

                  if (var29 != null && var8 < var29.itemIds.length) {
                     var29.itemIds[var8] = var30;
                     var29.itemQuantities[var8] = var10;
                  }

                  class373.itemContainerSetItem(var5, var8, var30 - 1, var10);
               }

               if (var29 != null) {
                  class144.invalidateWidget(var29);
               }

               ClientPacket.method5688();
               changedItemContainers[++field683 - 1 & 31] = var5 & 32767;
               var1.serverPacket = null;
               return true;
            }

            if (ServerPacket.field3312 == var1.serverPacket) {
               EnumComposition.method3751(class287.field3197);
               var1.serverPacket = null;
               return true;
            }

            class387.RunException_sendStackTrace("" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + (var1.field1386 != null ? var1.field1386.id : -1) + "," + var1.serverPacketLength, (Throwable)null);
            class31.logOut();
         } catch (IOException var47) {
            class349.method6839();
         } catch (Exception var48) {
            var31 = "" + (var1.serverPacket != null ? var1.serverPacket.id : -1) + "," + (var1.field1392 != null ? var1.field1392.id : -1) + "," + (var1.field1386 != null ? var1.field1386.id : -1) + "," + var1.serverPacketLength + "," + (MusicPatchNode.localPlayer.pathX[0] + WorldMapData_0.baseX * 64) + "," + (MusicPatchNode.localPlayer.pathY[0] + GameObject.baseY * 64) + ",";

            for(var6 = 0; var6 < var1.serverPacketLength && var6 < 50; ++var6) {
               var31 = var31 + var3.array[var6] + ",";
            }

            class387.RunException_sendStackTrace(var31, var48);
            class31.logOut();
         }

         return true;
      }
   }

   @ObfuscatedName("ko")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-47"
   )
   @Export("menu")
   final void menu() {
      class425.menuSort();
      if (clickedWidget == null) {
         int var1 = MouseHandler.MouseHandler_lastButton;
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         if (isMenuOpen) {
            int var15;
            if (var1 != 1 && (class473.mouseCam || var1 != 4)) {
               var2 = MouseHandler.MouseHandler_x;
               var3 = MouseHandler.MouseHandler_y;
               if (var2 < class192.menuX - 10 || var2 > DesktopPlatformInfoProvider.menuWidth + class192.menuX + 10 || var3 < ArchiveLoader.menuY - 10 || var3 > ArchiveLoader.menuY + class147.menuHeight + 10) {
                  isMenuOpen = false;
                  var4 = class192.menuX;
                  var5 = ArchiveLoader.menuY;
                  var6 = DesktopPlatformInfoProvider.menuWidth;
                  var7 = class147.menuHeight;

                  for(var15 = 0; var15 < rootWidgetCount; ++var15) {
                     if (rootWidgetWidths[var15] + rootWidgetXs[var15] > var4 && rootWidgetXs[var15] < var4 + var6 && rootWidgetHeights[var15] + rootWidgetYs[var15] > var5 && rootWidgetYs[var15] < var7 + var5) {
                        field705[var15] = true;
                     }
                  }
               }
            }

            if (var1 == 1 || !class473.mouseCam && var1 == 4) {
               var2 = class192.menuX;
               var3 = ArchiveLoader.menuY;
               var4 = DesktopPlatformInfoProvider.menuWidth;
               var5 = MouseHandler.MouseHandler_lastPressedX;
               var6 = MouseHandler.MouseHandler_lastPressedY;
               var7 = -1;

               int var16;
               for(var15 = 0; var15 < menuOptionsCount; ++var15) {
                  var16 = (menuOptionsCount - 1 - var15) * 15 + var3 + 31;
                  if (var5 > var2 && var5 < var2 + var4 && var6 > var16 - 13 && var6 < var16 + 3) {
                     var7 = var15;
                  }
               }

               int var10;
               int var11;
               int var12;
               if (var7 != -1 && var7 >= 0) {
                  var15 = menuArguments1[var7];
                  var16 = menuArguments2[var7];
                  var10 = menuOpcodes[var7];
                  var11 = menuIdentifiers[var7];
                  var12 = menuItemIds[var7];
                  String var13 = menuActions[var7];
                  String var14 = menuTargets[var7];
                  class17.menuAction(var15, var16, var10, var11, var12, var13, var14, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
               }

               isMenuOpen = false;
               var15 = class192.menuX;
               var16 = ArchiveLoader.menuY;
               var10 = DesktopPlatformInfoProvider.menuWidth;
               var11 = class147.menuHeight;

               for(var12 = 0; var12 < rootWidgetCount; ++var12) {
                  if (rootWidgetWidths[var12] + rootWidgetXs[var12] > var15 && rootWidgetXs[var12] < var10 + var15 && rootWidgetYs[var12] + rootWidgetHeights[var12] > var16 && rootWidgetYs[var12] < var16 + var11) {
                     field705[var12] = true;
                  }
               }
            }
         } else {
            var2 = DynamicObject.method2142();
            if ((var1 == 1 || !class473.mouseCam && var1 == 4) && this.shouldLeftClickOpenMenu()) {
               var1 = 2;
            }

            if ((var1 == 1 || !class473.mouseCam && var1 == 4) && menuOptionsCount > 0 && var2 >= 0) {
               var3 = menuArguments1[var2];
               var4 = menuArguments2[var2];
               var5 = menuOpcodes[var2];
               var6 = menuIdentifiers[var2];
               var7 = menuItemIds[var2];
               String var8 = menuActions[var2];
               String var9 = menuTargets[var2];
               class17.menuAction(var3, var4, var5, var6, var7, var8, var9, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
            }

            if (var1 == 2 && menuOptionsCount > 0) {
               this.openMenu(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
            }
         }

      }
   }

   @ObfuscatedName("kr")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1679837219"
   )
   @Export("shouldLeftClickOpenMenu")
   final boolean shouldLeftClickOpenMenu() {
      int var1 = DynamicObject.method2142();
      boolean var2 = leftClickOpensMenu && menuOptionsCount > 2;
      if (!var2) {
         boolean var3;
         if (var1 < 0) {
            var3 = false;
         } else {
            int var4 = menuOpcodes[var1];
            if (var4 >= 2000) {
               var4 -= 2000;
            }

            if (var4 == 1007) {
               var3 = true;
            } else {
               var3 = false;
            }
         }

         var2 = var3;
      }

      return var2 && !menuShiftClick[var1];
   }

   @ObfuscatedName("kl")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1018516557"
   )
   @Export("openMenu")
   final void openMenu(int var1, int var2) {
      class431.method8299(var1, var2);
      var1 -= viewportOffsetX;
      var2 -= viewportOffsetY;
      class31.scene.menuOpen(GameEngine.Client_plane, var1, var2, false);
      isMenuOpen = true;
   }

   @ObfuscatedName("ln")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "36188245"
   )
   @Export("resizeRoot")
   final void resizeRoot(boolean var1) {
      SequenceDefinition.method4149(rootInterface, GameEngine.canvasWidth, class262.canvasHeight, var1);
   }

   @ObfuscatedName("lt")
   @ObfuscatedSignature(
      descriptor = "(Lmq;I)V",
      garbageValue = "-1113228420"
   )
   @Export("alignWidget")
   void alignWidget(Widget var1) {
      Widget var2 = var1.parentId == -1 ? null : class165.getWidget(var1.parentId);
      int var3;
      int var4;
      if (var2 == null) {
         var3 = GameEngine.canvasWidth;
         var4 = class262.canvasHeight;
      } else {
         var3 = var2.width;
         var4 = var2.height;
      }

      class158.alignWidgetSize(var1, var3, var4, false);
      class192.alignWidgetPosition(var1, var3, var4);
   }

   @ObfuscatedName("me")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-94"
   )
   final void method1259() {
      class144.invalidateWidget(clickedWidget);
      ++class96.widgetDragDuration;
      if (field755 && field672) {
         int var1 = MouseHandler.MouseHandler_x;
         int var2 = MouseHandler.MouseHandler_y;
         var1 -= widgetClickX;
         var2 -= widgetClickY;
         if (var1 < field627) {
            var1 = field627;
         }

         if (var1 + clickedWidget.width > field627 + clickedWidgetParent.width) {
            var1 = field627 + clickedWidgetParent.width - clickedWidget.width;
         }

         if (var2 < field674) {
            var2 = field674;
         }

         if (var2 + clickedWidget.height > field674 + clickedWidgetParent.height) {
            var2 = field674 + clickedWidgetParent.height - clickedWidget.height;
         }

         int var3 = var1 - field676;
         int var4 = var2 - field677;
         int var5 = clickedWidget.dragZoneSize;
         if (class96.widgetDragDuration > clickedWidget.dragThreshold && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
            isDraggingWidget = true;
         }

         int var6 = var1 - field627 + clickedWidgetParent.scrollX;
         int var7 = var2 - field674 + clickedWidgetParent.scrollY;
         ScriptEvent var8;
         if (clickedWidget.onDrag != null && isDraggingWidget) {
            var8 = new ScriptEvent();
            var8.widget = clickedWidget;
            var8.mouseX = var6;
            var8.mouseY = var7;
            var8.args = clickedWidget.onDrag;
            HealthBarUpdate.runScriptEvent(var8);
         }

         if (MouseHandler.MouseHandler_currentButton == 0) {
            if (isDraggingWidget) {
               if (clickedWidget.onDragComplete != null) {
                  var8 = new ScriptEvent();
                  var8.widget = clickedWidget;
                  var8.mouseX = var6;
                  var8.mouseY = var7;
                  var8.dragTarget = draggedOnWidget;
                  var8.args = clickedWidget.onDragComplete;
                  HealthBarUpdate.runScriptEvent(var8);
               }

               if (draggedOnWidget != null) {
                  Widget var9 = clickedWidget;
                  int var10 = StructComposition.method3940(KeyHandler.getWidgetFlags(var9));
                  Widget var13;
                  if (var10 == 0) {
                     var13 = null;
                  } else {
                     int var11 = 0;

                     while(true) {
                        if (var11 >= var10) {
                           var13 = var9;
                           break;
                        }

                        var9 = class165.getWidget(var9.parentId);
                        if (var9 == null) {
                           var13 = null;
                           break;
                        }

                        ++var11;
                     }
                  }

                  if (var13 != null) {
                     PacketBufferNode var12 = class330.getPacketBufferNode(ClientPacket.OPHELDD, packetWriter.isaacCipher);
                     var12.packetBuffer.writeShortAdd(draggedOnWidget.itemId);
                     var12.packetBuffer.writeIntLE(draggedOnWidget.id);
                     var12.packetBuffer.writeShortAdd(draggedOnWidget.childIndex);
                     var12.packetBuffer.writeShortAdd(clickedWidget.childIndex);
                     var12.packetBuffer.writeIntME(clickedWidget.id);
                     var12.packetBuffer.writeShort(clickedWidget.itemId);
                     packetWriter.addNode(var12);
                  }
               }
            } else if (this.shouldLeftClickOpenMenu()) {
               this.openMenu(field676 + widgetClickX, widgetClickY + field677);
            } else if (menuOptionsCount > 0) {
               class204.method4177(field676 + widgetClickX, field677 + widgetClickY);
            }

            clickedWidget = null;
         }

      } else {
         if (class96.widgetDragDuration > 1) {
            if (!isDraggingWidget && menuOptionsCount > 0) {
               class204.method4177(field676 + widgetClickX, field677 + widgetClickY);
            }

            clickedWidget = null;
         }

      }
   }

   @ObfuscatedName("nv")
   @ObfuscatedSignature(
      descriptor = "(I)Ltm;",
      garbageValue = "637501068"
   )
   @Export("username")
   public Username username() {
      return MusicPatchNode.localPlayer != null ? MusicPatchNode.localPlayer.username : null;
   }

   public final void init() {
      try {
         if (this.checkHost()) {
            int var3;
            for(int var1 = 0; var1 <= 28; ++var1) {
               String var2 = this.getParameter(Integer.toString(var1));
               if (var2 != null) {
                  switch (var1) {
                     case 3:
                        if (var2.equalsIgnoreCase("true")) {
                           isMembersWorld = true;
                        } else {
                           isMembersWorld = false;
                        }
                        break;
                     case 4:
                        if (clientType == -1) {
                           clientType = Integer.parseInt(var2);
                        }
                        break;
                     case 5:
                        worldProperties = Integer.parseInt(var2);
                        break;
                     case 6:
                        ClanSettings.clientLanguage = Language.method6921(Integer.parseInt(var2));
                        break;
                     case 7:
                        AABB.field2611 = class146.method3269(Integer.parseInt(var2));
                        break;
                     case 8:
                        if (var2.equalsIgnoreCase("true")) {
                        }
                        break;
                     case 9:
                        class108.field1403 = var2;
                        break;
                     case 10:
                        field490 = (StudioGame)StructComposition.findEnumerated(TaskHandler.method3567(), Integer.parseInt(var2));
                        if (field490 == StudioGame.oldscape) {
                           class70.loginType = LoginType.oldscape;
                        } else {
                           class70.loginType = LoginType.field4914;
                        }
                        break;
                     case 11:
                        ViewportMouse.field2774 = var2;
                        break;
                     case 12:
                        worldId = Integer.parseInt(var2);
                     case 13:
                     case 16:
                     case 18:
                     case 19:
                     case 20:
                     case 22:
                     case 23:
                     case 24:
                     default:
                        break;
                     case 14:
                        TriBool.field4600 = Integer.parseInt(var2);
                        break;
                     case 15:
                        gameBuild = Integer.parseInt(var2);
                        break;
                     case 17:
                        GrandExchangeOffer.field4294 = var2;
                        break;
                     case 21:
                        field493 = Integer.parseInt(var2);
                        break;
                     case 25:
                        var3 = var2.indexOf(".");
                        if (var3 == -1) {
                           field497 = Integer.parseInt(var2);
                        } else {
                           field497 = Integer.parseInt(var2.substring(0, var3));
                           Integer.parseInt(var2.substring(var3 + 1));
                        }
                  }
               }
            }

            Scene.Scene_isLowDetail = false;
            isLowDetail = false;
            UserComparator8.worldHost = this.getCodeBase().getHost();
            String var11 = AABB.field2611.name;
            byte var12 = 0;

            try {
               JagexCache.idxCount = 22;
               JagexCache.cacheGamebuild = var12;

               try {
                  ModeWhere.operatingSystemName = System.getProperty("os.name");
               } catch (Exception var18) {
                  ModeWhere.operatingSystemName = "Unknown";
               }

               WorldMapSectionType.formattedOperatingSystemName = ModeWhere.operatingSystemName.toLowerCase();

               try {
                  HorizontalAlignment.userHomeDirectory = System.getProperty("user.home");
                  if (HorizontalAlignment.userHomeDirectory != null) {
                     HorizontalAlignment.userHomeDirectory = HorizontalAlignment.userHomeDirectory + "/";
                  }
               } catch (Exception var17) {
               }

               try {
                  if (WorldMapSectionType.formattedOperatingSystemName.startsWith("win")) {
                     if (HorizontalAlignment.userHomeDirectory == null) {
                        HorizontalAlignment.userHomeDirectory = System.getenv("USERPROFILE");
                     }
                  } else if (HorizontalAlignment.userHomeDirectory == null) {
                     HorizontalAlignment.userHomeDirectory = System.getenv("HOME");
                  }

                  if (HorizontalAlignment.userHomeDirectory != null) {
                     HorizontalAlignment.userHomeDirectory = HorizontalAlignment.userHomeDirectory + "/";
                  }
               } catch (Exception var16) {
               }

               if (HorizontalAlignment.userHomeDirectory == null) {
                  HorizontalAlignment.userHomeDirectory = "~/";
               }

               class130.cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", HorizontalAlignment.userHomeDirectory, "/tmp/", ""};
               class96.cacheSubPaths = new String[]{".jagex_cache_" + JagexCache.cacheGamebuild, ".file_store_" + JagexCache.cacheGamebuild};

               label155:
               for(var3 = 0; var3 < 4; ++var3) {
                  class335.cacheDir = ClanSettings.method3356("oldschool", var11, var3);
                  if (!class335.cacheDir.exists()) {
                     class335.cacheDir.mkdirs();
                  }

                  File[] var4 = class335.cacheDir.listFiles();
                  if (var4 == null) {
                     break;
                  }

                  File[] var5 = var4;
                  int var6 = 0;

                  while(true) {
                     if (var6 >= var5.length) {
                        break label155;
                     }

                     File var7 = var5[var6];

                     boolean var8;
                     try {
                        RandomAccessFile var9 = new RandomAccessFile(var7, "rw");
                        int var10 = var9.read();
                        var9.seek(0L);
                        var9.write(var10);
                        var9.seek(0L);
                        var9.close();
                        var8 = true;
                     } catch (Exception var15) {
                        var8 = false;
                     }

                     if (!var8) {
                        break;
                     }

                     ++var6;
                  }
               }

               File var13 = class335.cacheDir;
               class513.FileSystem_cacheDir = var13;
               if (!class513.FileSystem_cacheDir.exists()) {
                  throw new RuntimeException("");
               }

               FileSystem.FileSystem_hasPermissions = true;
               Tiles.method2222();
               JagexCache.JagexCache_dat2File = new BufferedFile(new AccessFile(class138.getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
               JagexCache.JagexCache_idx255File = new BufferedFile(new AccessFile(class138.getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
               class370.JagexCache_idxFiles = new BufferedFile[JagexCache.idxCount];

               for(int var14 = 0; var14 < JagexCache.idxCount; ++var14) {
                  class370.JagexCache_idxFiles[var14] = new BufferedFile(new AccessFile(class138.getFile("main_file_cache.idx" + var14), "rw", 1048576L), 6000, 0);
               }
            } catch (Exception var19) {
               class387.RunException_sendStackTrace((String)null, var19);
            }

            ScriptFrame.client = this;
            RunException.clientType = clientType;
            ModeWhere.field4347 = System.getenv("JX_ACCESS_TOKEN");
            TileItem.field1318 = System.getenv("JX_REFRESH_TOKEN");
            SpriteMask.field3475 = System.getenv("JX_SESSION_ID");
            class121.field1471 = System.getenv("JX_CHARACTER_ID");
            String var21 = System.getenv("JX_DISPLAY_NAME");
            Login.field911 = class31.method469(var21);
            if (Boolean.parseBoolean(System.getProperty("jagex.disableBouncyCastle"))) {
               this.field533 = true;
            }

            if (field495 == -1) {
               if (!this.method1431() && !this.method1234()) {
                  field495 = 0;
               } else {
                  field495 = 5;
               }
            }

            this.startThread(765, 503, 213, 1);
         }
      } catch (RuntimeException var20) {
         throw HealthBar.newRunException(var20, "client.init(" + ')');
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Lcom/jagex/oldscape/pub/OtlTokenRequester;)V"
   )
   public void setOtlTokenRequester(OtlTokenRequester var1) {
      if (var1 != null) {
         this.field531 = var1;
         class129.method3124(10);
      }
   }

   @ObfuscatedSignature(
      descriptor = "(Lcom/jagex/oldscape/pub/RefreshAccessTokenRequester;)V"
   )
   public void setRefreshTokenRequester(RefreshAccessTokenRequester var1) {
      if (var1 != null) {
         this.field551 = var1;
      }
   }

   public boolean isOnLoginScreen() {
      return gameState == 10;
   }

   public long getAccountHash() {
      return this.field543;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;B)V",
      garbageValue = "-10"
   )
   public static void method1770(AbstractArchive var0, AbstractArchive var1) {
      KitDefinition.KitDefinition_archive = var0;
      KitDefinition.KitDefinition_modelsArchive = var1;
      KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "-668307175"
   )
   static int method1233(int var0, Script var1, boolean var2) {
      if (var0 == ScriptOpcodes.LOGOUT) {
         logoutTimer = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
