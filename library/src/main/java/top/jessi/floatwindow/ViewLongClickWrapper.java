package top.jessi.floatwindow;

import android.view.View;

/**
 *    author : Android 轮子哥
 *    github : https://github.com/getActivity/EasyWindow
 *    time   : 2021/09/03
 *    desc   : {@link View.OnLongClickListener} 包装类
 */
@SuppressWarnings("rawtypes")
final class ViewLongClickWrapper implements View.OnLongClickListener {

    private final FloatWindow<?> mFloatWindow;
    private final FloatWindow.OnLongClickListener mListener;

    ViewLongClickWrapper(FloatWindow<?> floatWindow, FloatWindow.OnLongClickListener listener) {
        mFloatWindow = floatWindow;
        mListener = listener;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean onLongClick(View view) {
        if (mListener == null) {
            return false;
        }
        return mListener.onLongClick(mFloatWindow, view);
    }
}