.class Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;
.super Ljava/lang/Object;
.source "DragSortListView.java"


# instance fields
.field final synthetic a:Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView;

.field private b:Landroid/util/SparseIntArray;

.field private c:Ljava/util/ArrayList;

.field private d:I


# direct methods
.method public constructor <init>(Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView;)V
    .locals 2

    .prologue
    const/4 v1, 0x3

    .line 852
    iput-object p1, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->a:Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 853
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0, v1}, Landroid/util/SparseIntArray;-><init>(I)V

    iput-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->b:Landroid/util/SparseIntArray;

    .line 854
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->c:Ljava/util/ArrayList;

    .line 855
    iput v1, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->d:I

    .line 856
    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 2

    .prologue
    .line 879
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->b:Landroid/util/SparseIntArray;

    const/4 v1, -0x1

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    return v0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 883
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    .line 884
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 885
    return-void
.end method

.method public final a(II)V
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 862
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseIntArray;->get(II)I

    move-result v0

    .line 863
    if-eq v0, p2, :cond_1

    .line 864
    if-ne v0, v1, :cond_2

    .line 865
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    iget v1, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->d:I

    if-ne v0, v1, :cond_0

    .line 867
    iget-object v1, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->b:Landroid/util/SparseIntArray;

    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->c:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->delete(I)V

    .line 873
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->b:Landroid/util/SparseIntArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    .line 874
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 876
    :cond_1
    return-void

    .line 871
    :cond_2
    iget-object v0, p0, Lcom/alipay/android/app/template/view/widget/draglist/DragSortListView$HeightCache;->c:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method
