package com.ithread.oriyacalender;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ithread.oriyacalender.R;

import com.ithread.oriyacalender.PageCurlView;
import com.ithread.oriyacalender.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen. This fragment is either
 * contained in a {@link ItemListActivity} in two-pane mode (on tablets) or a
 * {@link ItemDetailActivity} on handsets.
 */
public class ItemDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy content this fragment is presenting.
	 */
	private DummyContent.DummyItem mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public ItemDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy content specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load content from a content provider.
			mItem = DummyContent.ITEM_MAP.get(getArguments().getString(
					ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_item_detail,
				container, false);

		// Show the dummy content as text in a TextView.
		if (mItem != null) {
			// ((ImageView)) rootView.findViewById(R.id.imageView1)).set
			// ((TextView) rootView.findViewById(R.id.item_detail))
			// .setText(mItem.content);

			// Resources res = getResources();
			// ImageView imageView = null;
			// Drawable drawable = null;

			if (mItem.content.equals("January")) {
				PageCurlView.SetIndex(1);
				// drawable = res.getDrawable( R.drawable.january );
			}
			if (mItem.content.equals("February")) {
				PageCurlView.SetIndex(2);
				// drawable = res.getDrawable( R.drawable.february );
			}
			if (mItem.content.equals("March")) {
				PageCurlView.SetIndex(3);
				// drawable = res.getDrawable( R.drawable.march );
			}
			if (mItem.content.equals("April")) {
				PageCurlView.SetIndex(4);
				// drawable = res.getDrawable( R.drawable.april );
			}
			if (mItem.content.equals("May")) {
				PageCurlView.SetIndex(5);
				// drawable = res.getDrawable( R.drawable.may );
			}
			if (mItem.content.equals("June")) {
				PageCurlView.SetIndex(6);
				// drawable = res.getDrawable( R.drawable.june );
			}
			if (mItem.content.equals("July")) {
				PageCurlView.SetIndex(7);
				// drawable = res.getDrawable( R.drawable.july );
			}
			if (mItem.content.equals("August")) {
				PageCurlView.SetIndex(8);
				// drawable = res.getDrawable(R.drawable.august);
			}
			if (mItem.content.equals("September")) {
				PageCurlView.SetIndex(9);
				// drawable = res.getDrawable( R.drawable.september );
			}
			if (mItem.content.equals("October")) {
				PageCurlView.SetIndex(10);
				// drawable = res.getDrawable( R.drawable.october );
			}
			if (mItem.content.equals("November")) {
				PageCurlView.SetIndex(11);
				// drawable = res.getDrawable( R.drawable.november );
			}
			if (mItem.content.equals("December")) {
				PageCurlView.SetIndex(12);
				// drawable = res.getDrawable( R.drawable.december );
			}

			// imageView = (ImageView) rootView.findViewById(R.id.imageView1);
			// imageView = (ImageView)
			// rootView.findViewById(R.id.dcgpagecurlPageCurlView1);

			// imageView.setImageDrawable( drawable );

		}

		return rootView;
	}
}
